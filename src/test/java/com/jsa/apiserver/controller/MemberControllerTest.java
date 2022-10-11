package com.jsa.apiserver.controller;

import com.jsa.apiserver.model.dto.MemberDto;
import com.jsa.apiserver.model.dto.RequestMemberDto;
import com.jsa.apiserver.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.SerializationFeature;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@WebMvcTest(MemberControllerTest.class)
//@AutoConfigureRestDocs
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class MemberControllerTest {
    @Autowired
    private MockMvc mvc;

//    @BeforeEach
//    public void  beforeEach() {
//        objectMapper = Jackson2ObjectMapperBuilder.json()
//                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
//                .modules(new JavaTimeModule())
//                .build();
//    }

    @Test
    public void restTest2() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/member/")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(result -> {
                MockHttpServletResponse response = result.getResponse();
                log.info(response.getContentAsString());
            });
    }
}
