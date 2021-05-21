package com.example.foodordering;

public class StaticRvModel {

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public StaticRvModel(int image, String text) {
        this.image = image;
        this.text = text;
    }

    private int image;
    private String text;


}
