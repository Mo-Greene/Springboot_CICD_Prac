package com.example.cicd0722.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/github")
    public String git() {
        return null;
    }

    // 깃허브액션 테스트 맨~
}
