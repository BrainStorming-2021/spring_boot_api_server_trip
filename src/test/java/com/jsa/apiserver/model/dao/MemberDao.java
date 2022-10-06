package com.jsa.apiserver.model.dao;

import lombok.Data;

@Data
public class MemberDao {
    private int memberNo;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
}
