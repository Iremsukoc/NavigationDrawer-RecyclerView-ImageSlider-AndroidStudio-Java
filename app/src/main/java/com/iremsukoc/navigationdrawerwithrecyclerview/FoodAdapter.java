package com.iremsukoc.navigationdrawerwithrecyclerview;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    FoodData[] foodData;
    Context context;

    public FoodAdapter(FoodData[] foodData, Context context) {
        this.foodData = foodData;
        this.context = context;
    }


    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.food_item_list,null,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        FoodData foodDataItem = foodData[position];
        holder.imageView.setImageResource(foodDataItem.getFoodImage());
        holder.textView.setText(foodDataItem.getFoodName());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int imageResource = foodDataItem.getFoodImage();

                Intent intent = new Intent(context, FullScreenFoodImage.class);
                intent.putExtra("image_resource",imageResource);

                ActivityOptions options = ActivityOptions.makeCustomAnimation(context, R.anim.zoom_in,0);

                context.startActivity(intent, options.toBundle());

            }
        });

    }

    @Override
    public int getItemCount() {
        return foodData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.food_name);
            imageView = itemView.findViewById(R.id.food_image);
        }
    }
}
