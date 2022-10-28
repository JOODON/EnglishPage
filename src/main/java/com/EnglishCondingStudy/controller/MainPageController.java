package com.EnglishCondingStudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping("/Eng/Main")
    public String MainPage(){

        return "MainPage";
    }
}
