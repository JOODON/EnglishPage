package com.EnglishCondingStudy.EnglishPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainPageController {
    @GetMapping("/EnglishPage/Main")
    public String MainPage(){

        return "mainpage";
    }
}
