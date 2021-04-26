package com.example.zaloapp;

import java.io.Serializable;

public class Person implements Serializable {
    int img;
    String title, content;
    String time;

    public Person(int img, String title, String content, String time) {

        this.img = img;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
