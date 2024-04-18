package com.example.wishapp.repository;

import com.example.wishapp.model.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository {
    @Autowired
    WishListRepository wishListRepository;
    public WishList getWishList(int id) {
        return wishListRepository.getWishList(id);
    }
}
