package com.oopsw.cjpa.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//회원 정보 - id, point
@Builder
@Data
@NoArgsConstructor //@data를 넣으니 에러나서 넣음
@AllArgsConstructor //@noArgs를 넣으니 builder가 에러나서 넣음
@Entity
public class Members {
    @Id
    private String memberId;
    private int point;

}
