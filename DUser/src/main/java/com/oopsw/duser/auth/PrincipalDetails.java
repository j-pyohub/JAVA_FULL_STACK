package com.oopsw.duser.auth;

import com.oopsw.duser.repository.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetails implements UserDetails {
    private User user; //내가 만든 거
    public PrincipalDetails(User user) {
        this.user = user;
    }


    public User getUser() {//모든 정보 보고 싶으면
        return user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //인가 정보 여러개
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(); //권한 중복될 일x -> List
        authorities.add(new GrantedAuthority() { //GrantedAuthority 인터페이스 재정의
            @Override
            public String getAuthority() {
                return user.getRole();
            }
        });
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername(); //로그인 이메일로 하고 싶으면 여기만 user.getEmail()
    }

}
