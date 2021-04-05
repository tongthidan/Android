package com.example.baikt.Model;

public class Cat {
    private int sourceImg;
    private String name;

    public Cat(int img2, String s) {

    }

    public Cat(int sourceImg) {
        this.sourceImg = sourceImg;
    }

    public int getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(int sourceImg) {
        this.sourceImg = sourceImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
