package com.oopsw.duser.auth;

import com.oopsw.duser.repository.User;
import com.oopsw.duser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //or @Autowired
@Service
public class PrincipalDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //user의 정보 로딩 목적
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return new PrincipalDetails(user); //return 개발자가 결정. 로그인 방식. 들어온 것에 따라 정보가 달라서 메모리에 올려야 함 -> new
        }
        return null;
    }
}
