package com.jsa.apiserver.model.dto;

import lombok.Data;

@Data
public class MemberDto {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
}
