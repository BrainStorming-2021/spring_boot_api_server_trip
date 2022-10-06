package com.jsa.apiserver.controller;

import com.jsa.apiserver.model.dto.MemberDto;
import com.jsa.apiserver.model.dto.RequestMemberDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class MemberControllerTest {
    @GetMapping("/member")
    public boolean isMemberLogin(@RequestBody RequestMemberDto _memberInfo) {

        return false;
    }
}
