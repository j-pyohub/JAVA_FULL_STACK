package com.oopsw.duser.controller;

import com.oopsw.duser.service.UserService;
import com.oopsw.duser.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final UserService userService;
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() {
        return "admin";
    }

    @GetMapping("/manager")
    @ResponseBody
    public String manager() {
        return "manager";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user() {
        return "user";
    }

    @GetMapping("/login") //secure 기본 설정이 우선이라, /login은 작동X
    @ResponseBody
    public String login() {
        return "login";
    }

    @GetMapping("loginView") //입력값으로 ui 넘어와야 할 때
    public String loginView(Model model) {
        if (true)
            model.addAttribute("message", "ID, PW 확인");
        return "loginView";
    }

    @GetMapping("joinView")
    public String joinView() {
        return "joinView";
    }

    @PostMapping("join")
    @ResponseBody
    public String join(UserRequest userRequest) { //request, vo, dto, map 다 해도 됨

        //return userRequest.toString();
        return "결과: " + userService.join(UserVO.builder().email(userRequest.getEmail())
                .username(userRequest.getUsername())
                .password(userRequest.getPassword()).build());
    }
}
