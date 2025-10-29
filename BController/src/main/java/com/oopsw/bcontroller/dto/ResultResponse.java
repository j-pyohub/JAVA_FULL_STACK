package com.oopsw.bcontroller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
//@NoArgsConstructor
public class ResultResponse {
    private String result = "실패했습니다.";

}
