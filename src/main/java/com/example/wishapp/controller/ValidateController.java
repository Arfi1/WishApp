package com.example.wishapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ValidateController {

    @PostMapping("/validate")
    public String validat(Model model, @RequestParam String name, @RequestParam String password) {
        if (name.equals(password)) {
            model.addAttribute("message", "Right!");
            return "home/index";

        } else {
            model.addAttribute("message", "Wrong!");
            return "home/index";
        }
    }
}

