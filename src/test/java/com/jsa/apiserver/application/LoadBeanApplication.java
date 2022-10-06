package com.jsa.apiserver.application;

import com.jsa.apiserver.config.ApplicationConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
// XXX 테스트 완료
//     - 삭제해도 되는 코드
@SpringBootTest
@ContextConfiguration(classes = LoadBeanApplication.class)
public class LoadBeanApplication {
    @Test
    public void testLoad() {
        System.out.println("빈 load 테스트 성공");
    }

    @Test
    public void readBean() {
        ApplicationContext appContest = new AnnotationConfigApplicationContext(LoadBeanApplication.class);
        // Bean Type으로 가져오기
        String bean01 = appContest.getBean(String.class);
        System.out.println(bean01);
    }
}
