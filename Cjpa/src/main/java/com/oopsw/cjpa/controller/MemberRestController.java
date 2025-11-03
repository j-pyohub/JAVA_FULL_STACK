package com.oopsw.cjpa.controller;

import com.oopsw.cjpa.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MemberRestController {
    private final MemberService memberService;

    //회원 등록
    @PostMapping("member")
    public ResponseEntity<Map<String, String>> postMember(@RequestBody MemberRequest member){ //post에서 주로 @RequestBody를 씀
        boolean result = memberService.addMember(member.getMemberId(), member.getPoint());
        if (result){
            return ResponseEntity.ok().body(Map.of("message", "add member success"));
        }
        return ResponseEntity.status(400).body(Map.of("message", "add member fail")); //ok()는 자주 쓰는 번호라 함수가 있음. 마땅한 게 없으면 status(~)로 주면 됨.
    }

    //회원 포인트 수정

    //회원 정보 삭제

    //특정 회원 포인트 확인

    //모든 회원 정보 확인
}
