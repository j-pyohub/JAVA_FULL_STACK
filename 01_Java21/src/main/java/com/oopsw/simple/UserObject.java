package com.oopsw.simple;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
//@Data //=Setter+Getter
public class UserObject {
    private String name;
    private int age;
}