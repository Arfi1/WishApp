package com.example.wishapp.service;

import com.example.wishapp.model.Wish;
import com.example.wishapp.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WishService {
    @Autowired
    WishRepository wishRepository;

    public List<Wish> getWishes() {
        return wishRepository.getWishes();
    }

    public Wish getWish(int id) {
        return wishRepository.getWish(id);
    }

    public void delete(int id) {
        wishRepository.delete(id);
    }

    public void insert(int WishID, String title, String beskrivelse, String billed, String URL) {
        wishRepository.insert(WishID, beskrivelse, title, billed, URL);
    }

    public Wish prepareUpdate(int id) {
        return wishRepository.getWish(id);
    }

    public void update(int WishID, String title, String beskrivelse, String billed, String URL) {
        wishRepository.update(WishID, beskrivelse, title, billed, URL);

    }
}