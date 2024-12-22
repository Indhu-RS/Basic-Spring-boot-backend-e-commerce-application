package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println( "Hi i'm here");
        return "Welcome to My Program !!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "We will learn together";
    };
    }
    
