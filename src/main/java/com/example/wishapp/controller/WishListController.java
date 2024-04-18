package com.example.wishapp.controller;

import com.example.wishapp.model.WishList;
import com.example.wishapp.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WishListController {
    @Autowired
    private WishListService wishListService;

    @GetMapping("/confirm_delete")
    public String confirmDelete(@RequestParam int id, Model model) {
        //model.addAttribute(wishListService.getWishList(id));
        return "home/confirm_delete";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam int id) {
        //wishListService.delete(id);
        return "redirect:/";
    }


}
