package com.ahmed.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.foodViewHolder> {
    Context context;
    ArrayList<Food> foodList = new ArrayList<>();
    foodInterface foodInterface;

    public foodAdapter(Context context, ArrayList<Food> foodList , foodInterface foodInterface) {
        this.context = context;
        this.foodList = foodList;
        this.foodInterface= foodInterface;
    }

    @NonNull
    @Override
    public foodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=  LayoutInflater.from(context).inflate(R.layout.foodlayout, parent, false);
        foodViewHolder holder= new foodViewHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull foodViewHolder holder, int position) {
        Food item= foodList.get(position);
        holder.imageView.setImageResource(item.getFoodImage());
        holder.foodTxt.setText(item.getFoodName());
        holder.foodPrice.setText(item.getFoodPrice()+"  $");

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodInterface.onImageClick(holder.imageView, item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class  foodViewHolder  extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView foodTxt, foodPrice;

        public foodViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.foodImage);
            foodTxt= itemView.findViewById(R.id.foodName);
            foodPrice=itemView.findViewById(R.id.foodPrice);
        }
    }
}
