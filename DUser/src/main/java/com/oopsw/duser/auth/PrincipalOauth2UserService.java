package com.oopsw.duser.auth;

import com.oopsw.duser.repository.User;
import com.oopsw.duser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        //필요한 부분(이름, 이메일)만 추출해서 로컬DB에서 관리
        //System.out.println(super.loadUser(userRequest).getAttributes());
        Map<String, Object> map = super.loadUser(userRequest).getAttributes();
        String name = (String) map.get("name");
        String email = (String) map.get("email");

        System.out.println(email + " + " + name);
        User user = userRepository.findByEmail(email);
        if (user == null) {
            //개인정보 로컬 서버에서 수집
            userRepository.save(User.builder()
                    .email(email)
                    .username(name)
                    .password(bCryptPasswordEncoder.encode("0000"))
                    .role("ROLE_USER")
                    .build());
        }
        return super.loadUser(userRequest);
    }
}
