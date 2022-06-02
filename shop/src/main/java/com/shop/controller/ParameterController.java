package com.shop.controller;

import com.shop.entity.Result;
import com.shop.service.MemberService;
import com.shop.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ParameterController {
    private final ResultService resultService;

     @RequestMapping("/third")
    public String example1(@RequestParam("to") String to, Model model){
         model.addAttribute("to", to);
         System.out.println(to);
         List<Result> list= resultService.getResultPage(to);

         model.addAttribute("result1", list.get(0).getUrl());
         model.addAttribute("result2", list.get(1).getUrl());
         model.addAttribute("result3", list.get(2).getUrl());
         model.addAttribute("result4", list.get(3).getUrl());

         return "/fitsresult";
     }

}




