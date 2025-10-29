package com.oopsw.bcontroller.controller;

import com.oopsw.bcontroller.dto.ResultResponse;
import com.oopsw.bcontroller.dto.UserUpdateResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController     //@RestController에는 ResponseBody를 안 써도 됨
@RequestMapping("/api") //아래 나오는 이름들에 /api 넣은 것처럼
public class UserRestController {
    @GetMapping("/user") // = /api/user
    public String getUser() {
        return "getUser";
    }
    @PostMapping("/user")
    public String postUser() {
        //insert
        ArrayList<String> list = new ArrayList<>();
        list.add("post1");
        list.add("post2");
        list.add("post3");
        return list.toString(); //data는 디폴트로 string
    }
    @DeleteMapping("/user")
    public String deleteUser() {
        return "{\"delete\" : " + "\"삭제되었습니다\"}"; //json 형태로 권장
    }
    @PutMapping("/user")
    public ResponseEntity<UserUpdateResponse> putUser() {
        UserUpdateResponse response = new UserUpdateResponse("pyo", "update ok");
        //return new ResponseEntity<>(response, HttpStatus.OK);
        return ResponseEntity.status(HttpStatus.OK).body(response); //ok 200. get 같이 오류날 상황이 없으면 굳이 안 써도 됨
        //return ResponseEntity.status(408).body(null); => 미리 정책을 정했다면 return 타입을 statuscode로, 안 정했다면 boolean 같은 것(가독성)
    }
    @GetMapping("/member")
    public ArrayList<String> getMember() {
        ArrayList<String> list = new ArrayList<>();
        list.add("member_1");
        list.add("member_2");
        list.add("member_3");
        return list;
    }
    @PostMapping("/member") //보통 post, put을 제외한 나머지는 body 안 쓰고 header 씀 (패턴!)
    public Map<String, Boolean> postMember(HttpServletRequest request) {
        HashMap<String, Boolean> map = new HashMap<>();
        //가입 DBMS 연결코드
        if (request.getParameter("member_id") == null) {
            map.put("result", false);
        } else {
            map.put("result", true);
        }
        return map;
    }
    @DeleteMapping("/member/{memberId}") // api/member/pyo ==> 인증데이터(key)넘길 때 주로 사용
    public ResultResponse deleteMember(@PathVariable String memberId) {
//        if (memberId == null) {
//            ResultResponse.builder().result("실패!").build();
//        }
        return ResultResponse.builder().result("성공했습니다").build();
    }

}
