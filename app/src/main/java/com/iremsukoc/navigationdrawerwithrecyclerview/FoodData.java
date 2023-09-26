package com.iremsukoc.navigationdrawerwithrecyclerview;

public class FoodData {

    private String foodName;
    private Integer foodImage;

    public FoodData(String foodName, Integer foodImage) {
        this.foodName = foodName;
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public Integer getFoodImage() {
        return foodImage;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodImage(Integer foodImage) {
        this.foodImage = foodImage;
    }
}
