package com.ahmed.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class Basic extends AppCompatActivity  implements  foodInterface{
    ArrayList<Food> Flist= new ArrayList<>();
    RecyclerView myRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        myRecycler= findViewById(R.id.foodrecycler);
        Flist.add(new Food(R.drawable.a2,"meal 1", 10.5F ));
        Flist.add(new Food(R.drawable.a3,"meal 2", 12.4F ));
        Flist.add(new Food(R.drawable.a4,"meal 3", 60.9F ));
        Flist.add(new Food(R.drawable.a5,"meal 4", 11F ));
        Flist.add(new Food(R.drawable.a6,"meal 5", 45F ));
        Flist.add(new Food(R.drawable.a7,"meal 6", 11.88F ));
        Flist.add(new Food(R.drawable.a8,"meal 7", 8F ));
        Flist.add(new Food(R.drawable.a9,"meal 8", 6.72F ));
        Flist.add(new Food(R.drawable.a10,"meal 9", 19.8F ));
        Flist.add(new Food(R.drawable.a11,"meal 10", 12.99F ));

        foodAdapter adapter= new foodAdapter(Basic.this, Flist, Basic.this);
        myRecycler.setLayoutManager(new GridLayoutManager(Basic.this, 2));
        myRecycler.setAdapter(adapter);





    }

    @Override
    public void onImageClick(ImageView imageView, Food food) {
        Intent myIntent= new Intent(Basic.this, Detail.class);
        myIntent.putExtra("foodName",  food.getFoodName() );
        myIntent.putExtra("foodPrice", food.getFoodPrice());
        myIntent.putExtra("foodImage", food.getFoodImage());

        startActivity(myIntent);

    }
}