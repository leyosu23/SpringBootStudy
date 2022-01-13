package com.example.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Firstcontroller {

    @GetMapping("/hi")
    public String greeting(Model model){
        model.addAttribute("username","YS");
        return "greetings"; // templates/greetings.mustache -> send to browser!
    }
}
