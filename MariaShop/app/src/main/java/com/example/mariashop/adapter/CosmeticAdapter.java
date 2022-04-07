package com.example.mariashop.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mariashop.R;
import com.example.mariashop.model.Cosmetic;

import java.util.List;

public class CosmeticAdapter extends RecyclerView.Adapter< CosmeticAdapter.CosmeticViewHolder> {
    Context context;
    List<Cosmetic> cosmetics;

    public CosmeticAdapter(Context context, List<Cosmetic> cosmetics) {
        this.context = context;
        this.cosmetics = cosmetics;
    }

    @NonNull
    @Override
    public CosmeticViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//работа с дизайном
        View cosmeticItems = LayoutInflater.from(context).inflate(R.layout.cosmetic_item, parent, false); //использование элементов для дизайна
        return new CosmeticAdapter.CosmeticViewHolder(cosmeticItems);// возвращение описанного элемента через класс adapterViewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull CosmeticViewHolder holder, int position) {//что конкретно добавляем в дизайн
    holder.cosmeticList.setBackgroundColor(Color.parseColor(cosmetics.get(position).getColor()));

    int imageId= context.getResources().getIdentifier("ic_" + cosmetics.get(position).getImg(),"drawable", context.getPackageName());
    holder.cosmeticImage.setImageResource(imageId);

    holder.cosmeticTitle.setText(cosmetics.get(position).getTitle());
    holder.cosmeticDate.setText(cosmetics.get(position).getDate());
    holder.cosmeticPrice.setText(cosmetics.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return cosmetics.size(); //размеры
    }

    public static final class CosmeticViewHolder extends RecyclerView.ViewHolder{ //какими элементами в дизайне будем располагать

        LinearLayout cosmeticList;
        ImageView cosmeticImage;
        TextView cosmeticTitle, cosmeticDate, cosmeticPrice;

        public CosmeticViewHolder(@NonNull View itemView) {
            super(itemView);
            cosmeticList=itemView.findViewById(R.id.cosmeticList);
            cosmeticImage=itemView.findViewById(R.id.cosmeticImage);
            cosmeticTitle=itemView.findViewById(R.id.cosmeticTitle);
            cosmeticDate=itemView.findViewById(R.id.cosmeticDate);
            cosmeticPrice=itemView.findViewById(R.id.cosmeticPrice);




        }
    }
}
