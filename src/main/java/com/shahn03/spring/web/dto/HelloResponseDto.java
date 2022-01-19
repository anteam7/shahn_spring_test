package com.shahn03.spring.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//Get 메소드 생성
@Getter
//final 필드가 포함된 생성자를 생성
//final 이 없는 경우 생성자 생성 안됨
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
