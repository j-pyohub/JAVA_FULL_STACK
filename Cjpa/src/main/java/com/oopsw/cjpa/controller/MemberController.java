package com.oopsw.cjpa.controller;

import com.oopsw.cjpa.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MemberController {
    @GetMapping("member")
    public String member(Model model) {
        //서비스에서 필요한 데이터 메모리에 전달
        model.addAttribute("name", "표수정");
        return "member";
    }

    @GetMapping("member2")
    public String member2(@RequestParam String name, Model model) { //파라미터가 꼭 필요하면 @RequestParam으로 하는 것 권장, httpSession도 있음
        model.addAttribute("name", name + "입니다"); //데이터는 한번 거쳐서 넣는 것 권장
        model.addAttribute("user", new MemberVO(name, 100));
        return "member2";
    }

    @GetMapping("link")
    public String link(Model model) {
        model.addAttribute("p1", "data1"); //db에서 가져올 데이터
        model.addAttribute("p2", "data2");
        return "link";
    }

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("list", List.of("사과", "배", "포도"));
        return "list";
    }
}
