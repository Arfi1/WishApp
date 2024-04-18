package com.example.wishapp.controller;

import com.example.wishapp.model.Wish;
import com.example.wishapp.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class WishController {

    @Autowired
    private WishRepository wishRepository;

    @GetMapping("/")
    public String showWishes(Model model) {
        List<Wish> wishes = wishRepository.findAll();

        model.addAttribute("wishes", wishes);
        model.addAttribute("newWish", new Wish());
        return "Wish";
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
}