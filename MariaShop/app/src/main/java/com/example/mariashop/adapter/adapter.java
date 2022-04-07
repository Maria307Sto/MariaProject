package com.example.mariashop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mariashop.R;
import com.example.mariashop.model.Category;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.adapterViewHolder> {

    Context context; // поле для создания страницы со списками
    List<Category> categories; //список полей категорий

    //генерация и создания конструктора


    public adapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public adapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false); //использование элементов для дизайна
        return new adapterViewHolder(categoryItems);// возвращение описанного элемента через класс adapterViewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull adapterViewHolder holder, int position) {
    // в данном методе указываем, что конкретно в каждй категории будем использовать
        holder.categoryTitle.setText(categories.get(position).getTitle()); //возвращение параметров и названий каждой категории
    }

    @Override
    public int getItemCount() {
        return categories.size();// возвращение значения количества элементов в списке
    }

    public static final class adapterViewHolder extends RecyclerView.ViewHolder{
        //создаём поля для дизайна

        TextView categoryTitle;


        public adapterViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryTitle=itemView.findViewById(R.id.categoryTitle);//обращение к категории по id
        }
    }
}
