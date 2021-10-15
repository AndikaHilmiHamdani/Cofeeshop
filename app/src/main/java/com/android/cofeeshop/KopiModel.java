package com.android.cofeeshop;

public class KopiModel {
    private String title, rating, price;
    int image;
    public KopiModel() {
    }
    public KopiModel(String title, String rating, String price,int image) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.image=image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }
}
