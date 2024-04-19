package com.example.wishapp.controller;

import com.example.wishapp.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class WishController {
        @Autowired
        private WishService wishService;

        @GetMapping("/confirm_delete")
        public String confirmDelete(@RequestParam int id, Model model) {
            model.addAttribute(wishService.getWish(id));
            return "home/confirm_delete";
        }

        @PostMapping("/delete")
        public String delete(@RequestParam int id) {
            wishService.delete(id);
            return "redirect:/";
        }

        @GetMapping("/new")
        public String insert() {
            return "home/new";
        }

    @PostMapping("/insert")
    public String insert(@RequestParam String title, @RequestParam int WishID,
                         @RequestParam String beskrivelse, @RequestParam String billed, @RequestParam String URL) {
        wishService.insert(WishID, beskrivelse, title, billed, URL);
        return "redirect:/";
    }


    @GetMapping("/prepare_update")
        public String prepareUpdate(@RequestParam int id, Model model) {
            model.addAttribute(wishService.prepareUpdate(id));
            return "home/update";
        }

        @PostMapping("/update")
        public String update(@RequestParam String title, @RequestParam int WishID,
                             @RequestParam String beskrivelse, @RequestParam String billed, @RequestParam String URL) {
            wishService.update(WishID, beskrivelse, title, billed, URL);
            return "redirect:/";

        }
    }
