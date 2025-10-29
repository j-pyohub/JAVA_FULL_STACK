package com.oopsw.bcontroller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class CustomerResponse {
    private String customerId;
    private String name;
    private int point;
}
