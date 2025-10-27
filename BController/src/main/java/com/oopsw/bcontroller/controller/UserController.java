package com.oopsw.bcontroller.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping("/")
    @ResponseBody
    public String index() { //index.html를 디폴트로 안 두고, '/' 루트를 바꾼 것. index.html은 우선순위 밀림
        return "/ root 이동";
    }
    @GetMapping("/user") //request
    @ResponseBody           //response
    public String user() {
        return "<h2>user</h2>";
    }
    @GetMapping("/view")
    public String view(Model model) { //request에 넣으면 조작이 쉬워서, Model 사용
        //단순 목록 ex.공지사항 리스트, ...
        model.addAttribute("message", "HiHi~~~");
        return "view"; //view.jsp
    }

    //http://127.0.0.1:5432/request?point=100&name=pyosj
    @GetMapping("/request")
    public String request(HttpServletRequest request, Model model) { //controller의 인자값을 내 마음대로 조절할 수 있다는 장점. request/model 둘 다 가능
        String name = request.getParameter("name");
        int point = Integer.parseInt(request.getParameter("point"));
        //service - dao

        request.setAttribute("requestResult", name);
        //or
        model.addAttribute("modelResult", point);

        return "request"; //jsp
        }

}
