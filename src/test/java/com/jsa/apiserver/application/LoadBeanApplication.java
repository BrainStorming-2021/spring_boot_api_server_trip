package com.jsa.apiserver.application;

import com.jsa.apiserver.config.ApplicationConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = LoadBeanApplication.class)
public class LoadBeanApplication {
    @Test
    public void testLoad() {
        System.out.println("빈 load 테스트 성공");
    }
}
