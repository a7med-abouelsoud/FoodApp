package com.ahmed.foodapp;

import java.io.Serializable;

public class Food {
    private Integer FoodImage;
    private  String FoodName;
    private float  FoodPrice;

    public Food(Integer foodImage, String foodName, float foodPrice) {
        FoodImage = foodImage;
        FoodName = foodName;
        FoodPrice = foodPrice;
    }

    public Integer getFoodImage() {
        return FoodImage;
    }

    public void setFoodImage(Integer foodImage) {
        FoodImage = foodImage;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public float getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(float foodPrice) {
        FoodPrice = foodPrice;
    }
}
