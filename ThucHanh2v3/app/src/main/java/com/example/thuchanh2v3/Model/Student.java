package com.example.thuchanh2v3.Model;

public class Student {
    int image;
    String id,name,gender,dob;

    public Student() {
    }

    public Student(int image, String id, String name, String gender, String dob) {

        this.image = image;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
