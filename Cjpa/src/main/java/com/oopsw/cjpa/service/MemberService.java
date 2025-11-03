package com.oopsw.cjpa.service;

import com.oopsw.cjpa.repository.MemberRepository;
import com.oopsw.cjpa.repository.Members;
import com.oopsw.cjpa.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    //회원 등록
    public boolean addMember(String memberId, int point) { //사용자 입장에서 VO에 뭐가 있는지 알 수 없음. VO 안 만들어도 되긴 함
        return addMember(new MemberVO(memberId, point)); //아래 메서드 호출
    }
    public boolean addMember(MemberVO vo){
        if(memberRepository.existsById(vo.getMemberId())){
            return false;
        }
        memberRepository.save(Members.builder().memberId(vo.getMemberId()).point(vo.getPoint()).build());
        return true;
    }
    //회원 포인트 수정

    //회원 정보 삭제

    //특정 회원 포인트 확인

    //모든 회원 정보 확인
}
