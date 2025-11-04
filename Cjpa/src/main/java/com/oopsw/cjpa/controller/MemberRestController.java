package com.oopsw.cjpa.controller;

import com.oopsw.cjpa.service.MemberService;
import com.oopsw.cjpa.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    @PutMapping("member")
    public ResponseEntity<Map<String, String>> mapResponseEntity(@RequestBody Map<String, String> member){ //requsetBody: json으로 던져 줌
//        try {
            memberService.updatePoint(member.get("memberId").toString(),
                    Integer.parseInt(member.get("updatePoint").toString())); //return이 void라 result 변수 없어도 됨
//        } catch (Exception e) {
//            return ResponseEntity.status(400).body(Map.of("message", "update point fail"));
//        } //but 군데군데 try/catch 때문에 중복코드 생김
        return ResponseEntity.ok().body(Map.of("message", "update member success"));
    }

    //회원 정보 삭제

    //특정 회원 포인트 확인

    //모든 회원 정보 확인
    @GetMapping("members")
    public List<MemberVO> getMembers(){ //어차피 200이라서, ResponseEntity쓸 필요 없음
        return memberService.getMembers();
    }
}
