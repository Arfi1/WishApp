package com.example.wishapp.controller;

import com.example.wishapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @PostMapping("/validate")
    public String validate(Model model, @RequestParam String name,
                           @RequestParam String password) {
        if (name.equals(password)) {
            model.addAttribute("message", "Right!");
            return "home/Login";
        } else {
            model.addAttribute("message", "Wrong!");
            return "home/Login";
        }
    }
}
