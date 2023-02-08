package com.mybook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MybookController {
   @ResponseBody
   @RequestMapping("/")
   public String home() {
      System.out.println("Hello Boot!");
      return "Hello Boot!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
   }
   
   @RequestMapping("/kimbomi.do")
   public String hello(Model model) {
      System.out.println("안녕하세요");
      model.addAttribute("message","hello.jsp입니다.!");
      return "hello";
   }
   
}