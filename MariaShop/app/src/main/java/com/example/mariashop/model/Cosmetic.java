package com.example.mariashop.model;

public class Cosmetic {
    //поля для вывода товара на экран

    int id; //идентификатор товара
    String img, title, date, price, color;

    public Cosmetic(int id, String img, String title, String date, String price, String color) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.date = date;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
