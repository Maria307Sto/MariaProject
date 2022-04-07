package com.example.mariashop.model;

public class Category {
    int id; //порядковый номер каждого поля
    String title; //наименование поля

    public Category(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() { //получить значение в опред. поел
        return id;
    }

    public void setId(int id) { //установить значение в опред. поле
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
