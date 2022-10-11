package com.jsa.apiserver.application;

import com.jsa.apiserver.controller.MemberControllerTest;
import com.jsa.apiserver.model.dto.RequestMemberDto;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = LoadBeanApplication.class)
public class ReadControllerApplication {
    @InjectMocks
    RequestMemberDto _requestMember;

//    @Autowired
//    MemberControllerTest _memberController;

//    @Test
//    public void testController() {
//        System.out.println(_memberController.isMemberLogin(_requestMember));
//    }
}
