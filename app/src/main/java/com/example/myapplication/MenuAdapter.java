package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<MenuModel> imageModelArayList2;


    public MenuAdapter(Context context, ArrayList<MenuModel> imageModelArayList2) {
        this.context = context;
        this.imageModelArayList2 = imageModelArayList2;
    }

    @NonNull
    @Override
    public MenuAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int x) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item2, viewGroup, false);
        MenuAdapter.MyViewHolder holder = new MenuAdapter.MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MyViewHolder myViewHolder, int x) {
        myViewHolder.img2.setImageResource(imageModelArayList2.get(x).getImgMenu());
        myViewHolder.menu.setText(imageModelArayList2.get(x).getMenu());
    }

    @Override
    public int getItemCount() {
        return imageModelArayList2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img2;
        public TextView menu;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img2 = itemView.findViewById(R.id.img_menu);
            menu = itemView.findViewById(R.id.tv_menu);
        }
    }
}
