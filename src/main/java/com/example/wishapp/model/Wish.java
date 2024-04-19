package com.example.wishapp.model;

public class Wish {
    private int wishID;
    private String name;
    private String beskrivelse;
    private String billed;
    private String url;

    public Wish() {

    }

    public Wish(int wishID, String name, String beskrivelse, String billed, String url) {
        this.wishID = wishID;
        this.name = name;
        this.beskrivelse = beskrivelse;
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

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
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
                ", description='" + beskrivelse + '\'' +
                ", image='" + billed + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
