package com.shahn03.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

//SpringBootApplication 설정으로 스프링 빈, 자동설정이 가능해짐, 여기서부터 실행되므로 항상 최상단 위치할 필요함
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run <- 이 실행되면 내장 was 가 실행되어 tomcat 를 별도로 실행할 필요 없음
        //항상 동일한 환경 was설정 가능 
        SpringApplication.run(Application.class, args);
    }
}
