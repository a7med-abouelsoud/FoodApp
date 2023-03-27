package com.ahmed.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Detail extends AppCompatActivity {
    ImageView myImage;
    TextView name, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        myImage=findViewById(R.id.myImage);
        name=findViewById(R.id.foodname);
        price=findViewById(R.id.foodprice);
        String foodName = getIntent().getStringExtra("foodName");
        Float foodPrice = getIntent().getFloatExtra("foodPrice", 0f);
        Integer foodImage= getIntent().getIntExtra("foodImage", 0);

        myImage.setImageResource(foodImage);
        name.setText(foodName);
        price.setText(foodPrice+ "$");


    }
}