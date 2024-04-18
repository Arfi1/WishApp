package com.example.wishapp.model;

import java.util.ArrayList;
import java.util.List;

public class WishList {
    private int wishListID;
    private String title;
    private String image;
    private List<Wish> wishes;

    public WishList() {
        this.wishes = new ArrayList<>();
    }

    public WishList(String title, String image) {
        this.title = title;
        this.image = image;
        this.wishes = new ArrayList<>();
    }

    public int getWishListID() {
        return wishListID;
    }

    public void setWishListID(int wishListID) {
        this.wishListID = wishListID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Wish> getWishes() {
        return wishes;
    }

    public void setWishes(List<Wish> wishes) {
        this.wishes = wishes;
    }

    public void addWish(Wish wish) {
        this.wishes.add(wish);
    }

    @Override
    public String toString() {
        return "WishList{" +
                "wishListID=" + wishListID +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", wishes=" + wishes +
                '}';
    }
}