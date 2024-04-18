package com.example.wishapp.service;

import com.example.wishapp.model.WishList;
import com.example.wishapp.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WishListService {
   @Autowired
    private WishListRepository wishListRepository;

    public WishList getWishListRepository(int id) {
        return wishListRepository.getWishList(id);
    }
}
