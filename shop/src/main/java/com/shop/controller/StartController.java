package com.shop.controller;

import com.shop.dto.MemberDto;
import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import com.shop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class StartController {

    private final MemberService memberService;


    @GetMapping("/start")
    public String getStart(@RequestParam("email") String email) {
        return memberService.getStartPage(email);
    }

}