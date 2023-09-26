package com.iremsukoc.navigationdrawerwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;


public class Food extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);



        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        FoodData[] foodDataList = new FoodData[]{
                new FoodData("Hamburger",R.drawable.hamburger_image),
                new FoodData("Pizza",R.drawable.pizza_image),
                new FoodData("Fries",R.drawable.fries_image),
                new FoodData("Chicken",R.drawable.chicken_image),
                new FoodData("Salad",R.drawable.salad_image),
        };

        FoodAdapter foodAdapter = new FoodAdapter(foodDataList, Food.this);
        recyclerView.setAdapter(foodAdapter);



    }

}