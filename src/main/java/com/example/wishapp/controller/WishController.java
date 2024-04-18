package com.example.wishapp.controller;

import com.example.wishapp.model.Wish;
import com.example.wishapp.repository.WishRepository;
import com.example.wishapp.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class WishController {

    @Autowired
    private WishRepository wishRepository;

    @Autowired
    private WishListService wishListService;
    @GetMapping("/")
    public String showWishes(Model model) {
        List<Wish> wishes = wishRepository.findAll();

        model.addAttribute("wishes", wishes);
        model.addAttribute("newWish", new Wish());
        return "Wish";
    }
    @GetMapping("/confirm_delete")
    public String confirmDelete(@RequestParam int id, Model model) {
        model.addAttribute(wishListService.getWishList(id));
        return "home/confirm_delete";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam int id) {
        wishListService.delete(id);
        return "redirect:/";
    }

    @PostMapping("/wishes/add")
    public String addWish(@ModelAttribute("newWish") Wish newWish) {
      //  wishRepository.save(newWish);
        return "redirect:/";
    }

    @GetMapping("/wishes/delete/{id}")
    public String deleteWish(@PathVariable Long id) {
        //wishRepository.deleteById(id);
        return "redirect:/";
    }
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
