package com.oopsw.ejwt.jwt;

//yaml으로 밖으로 빼도 되고, interface 안에서 만들어도 됨
public interface JwtProperties {
    String SECRET = "oopsw"; //우리 서버에서만 알고 있는 비밀값. 보통은 인코딩해서 넣음
    int EXPIRATION_TIME = 1000 * 30; //30초
    String TOKEN_PREFIX = "Bearer "; //일종의 문화. 시작 문자열
    String HEADER_STRING = "Authorization";
}
