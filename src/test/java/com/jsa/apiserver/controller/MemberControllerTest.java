package com.jsa.apiserver.controller;

import com.jsa.apiserver.model.dto.RequestMemberDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
//@RestController
@WebMvcTest(MemberControllerTest.class)
@DisplayName("REST 컨트롤러 테스트")
public class MemberControllerTest {
    @InjectMocks
    private RequestMemberDto _requestMember;

//    @GetMapping("/member")
    @Test
    public boolean isMemberLogin(@RequestBody RequestMemberDto _memberInfo) {
        return false;
    }
}
