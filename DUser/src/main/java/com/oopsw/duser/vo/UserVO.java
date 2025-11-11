package com.oopsw.duser.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {
    //왔다갔다 하는 데이터기 때문에 전부 가져옴
    private long id; //나중에 연결고리 필요시 의미 있음. table 1개인 jpa인 상황에서는 굳이 필요 없음
    private String username;
    private String password;
    private String email;
    private String role;
    private Timestamp createdAt;
}
