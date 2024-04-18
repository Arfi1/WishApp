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
    public List<Wish> getWishes(){
        return wishRepository.getWishes();
    }
    public Wish getWish(int id){
        return wishRepository.getWish(id);
    }
    public void deleteById(int id){
        wishRepository.deleteById(id);
    }
    public void save(Wish wish){
        wishRepository.save(wish);
    }
    public List<Wish> findAll(){
        return wishRepository.findAll();
    }
}
