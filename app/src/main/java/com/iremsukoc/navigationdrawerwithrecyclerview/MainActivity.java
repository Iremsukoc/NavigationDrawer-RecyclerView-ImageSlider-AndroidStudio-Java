package com.iremsukoc.navigationdrawerwithrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends  AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    //Variables
    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.sales_banner1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sales_banner3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sales_banner2, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.main_navView);
        drawerLayout = findViewById(R.id.drawerLayout);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);


        //Navigation View

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        // the selected menu appears in a different color
        navigationView.bringToFront();
        // default selected menu
        navigationView.setCheckedItem(R.id.nav_home);


    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        String itemName = (String) item.getTitle();

        if (itemId == R.id.nav_food) {
            Intent intent = new Intent(MainActivity.this, Food.class);
            startActivity(intent);
        } else
        {
            Toast.makeText(this,itemName, Toast.LENGTH_SHORT).show();
        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }
}