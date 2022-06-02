package com.shop.controller;

import com.shop.service.MemberService;
import com.shop.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ParameterController {
    private final ResultService resultService;

     @RequestMapping("/third")
    public String example1(@RequestParam("to") String to, Model model){
         model.addAttribute("to", to);
         System.out.println(to);
         System.out.println(resultService.getResultPage(to));
         return "/third";
     }

}




