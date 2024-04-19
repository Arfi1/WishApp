package com.example.wishapp.controller;

import com.example.wishapp.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private WishService wishService;

    @GetMapping("/")
    public String index() {
        // Controller logic
        return "home/index";
    }


}