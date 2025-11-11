package com.oopsw.duser.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"password"}) //비밀번호 노출X
public class UserRequest {
    //repository에서 request에서 필요한 것들만 가져옴
    private String username;
    private String password;
    private String email;
    private String role;
}
