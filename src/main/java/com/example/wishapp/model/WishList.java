package com.example.wishapp.model;

import java.util.ArrayList;
import java.util.List;

public class WishList {
    private int wishListID;
    private String title;
    private String billed;
    private List<Wish> wishes;

    public WishList() {
        this.wishes = new ArrayList<>();
    }

    public WishList(String title, String billed) {
        this.title = title;
        this.billed = billed;
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

    public String getBilled() {
        return billed;
    }

    public void setBilled(String billed) {
        this.billed = billed;
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
                ", image='" + billed + '\'' +
                ", wishes=" + wishes +
                '}';
    }
}