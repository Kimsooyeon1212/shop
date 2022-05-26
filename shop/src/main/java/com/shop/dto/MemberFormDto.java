package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String name;

    @NotNull(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotNull(message = "비밀번호는 필수 입력 값입니다.")
    private String password;

    @NotNull(message = "키는 필수 입력 값입니다.")
    private int height;

    @NotNull(message = "몸무게는 필수 입력 값입니다.")
    private int weight;

    @NotNull(message = "성별은 필수 입력 값입니다.")
    private String sex;

    private String style;


}
