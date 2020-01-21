package com.jojoldu.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 으로 인해 스프링부트의 자동설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정된다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // SpringApplication.run 으로 인해 내장 WAS를 실행시켜준다.
        SpringApplication.run(Application.class, args);

    }
}
