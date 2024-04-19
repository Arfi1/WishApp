package com.example.wishapp.model;

public class Wish {
    private int wishID;
    private String name;
    private String description;
    private String billed;
    private String url;

    public Wish() {

    }

    public Wish(int wishID, String name, String description, String billed, String url) {
        this.wishID = wishID;
        this.name = name;
        this.description = description;
        this.billed = billed;
        this.url = url;
    }

    public void setWishID(int wishID) {
        this.wishID = wishID;
    }

    public int getWishID() {
        return wishID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBilled() {
        return billed;
    }

    public void setBilled(String billed) {
        this.billed = billed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Wish{" +
                "wishID=" + wishID +
                ", description='" + description + '\'' +
                ", image='" + billed + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
