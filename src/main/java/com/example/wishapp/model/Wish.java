package com.example.wishapp.model;

public class Wish {
    private int wishID;
    private String description;
    private String image;
    private String url;

    public Wish() {

    }

    public Wish(int wishID, String description, String image, String url) {
        this.wishID = wishID;
        this.description = description;
        this.image = image;
        this.url = url;
    }

    public void setWishID(int wishID) {
        this.wishID = wishID;
    }

    public int getWishID() {
        return wishID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
                ", image='" + image + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
