package com.example.mariashop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.hardware.lights.LightState;
import android.os.Bundle;

import com.example.mariashop.adapter.CosmeticAdapter;
import com.example.mariashop.adapter.adapter;
import com.example.mariashop.model.Category;
import com.example.mariashop.model.Cosmetic;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, cosmeticRecycler;
    adapter categoryAdapter;
    CosmeticAdapter cosmeticAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //создаём список из различных категорий
        List<Category> categoryList= new ArrayList<>(); //создали список и выделили память в виде массива для категорий
        categoryList.add(new Category(1,"Для лица"));
        categoryList.add(new Category(2,"Для тела"));
        categoryList.add(new Category(3,"Для волос"));
        categoryList.add(new Category(4,"Парфюмерия"));

        setCategoryRecycler(categoryList);

        List<Cosmetic> cosmeticList= new ArrayList<>(); //создали список и выделили память в виде массива для категорий
        cosmeticList.add(new Cosmetic(1,"cream_t", "LE SOIN NOIR\nЛЕГКИЙ КРЕМ\nНЕВЕСОМЫЙ КРЕМ ДЛЯ УПРУГОСТИ КОЖИ","12.09.2021","900 руб.","#FFA07A"));
        cosmeticList.add(new Cosmetic(2,"face_1","RESSOURCE\nДНЕВНОЙ КРЕМ\nРОСКОШНЫЙ УВЛАЖНЯЮЩИЙ КРЕМ АНТИ-СТРЕСС","11.08.2020","678 руб.","#FFA07A"));

        setCosmeticRecycler(cosmeticList);
    }

    private void setCosmeticRecycler(List<Cosmetic> cosmeticList) {

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);// расположение элементов друг за другом горизонтально
        cosmeticRecycler = findViewById(R.id.cosmeticRecycler); // ссылка на лист с категориями
        cosmeticRecycler.setLayoutManager(layoutManager);//настройка на ссылку на объект

        //указываем адаптер

        cosmeticAdapter=new CosmeticAdapter(this, cosmeticList);
        cosmeticRecycler.setAdapter(cosmeticAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        //указываем настройки и параметры для вывода всей информации, т.к. по умолчанию все элементы иду друг за другом по строкам
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);// расположение элементов друг за другом горизонтально
        categoryRecycler = findViewById(R.id.categoryRecycler); // ссылка на лист с категориями
        categoryRecycler.setLayoutManager(layoutManager);//настройка на ссылку на объект

        //указываем адаптер

        categoryAdapter=new adapter(this,categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

    }
}