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
import java.util.zip.Inflater;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<MovieModel> imageModelArayList;


    public MovieAdapter(Context context, ArrayList<MovieModel> imageModelArayList) {
        this.context = context;
        this.imageModelArayList = imageModelArayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.img.setImageResource(imageModelArayList.get(i).getImgDrawable());
        myViewHolder.tittle.setText(imageModelArayList.get(i).getTittle());
    }

    @Override
    public int getItemCount() {
        return imageModelArayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView tittle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_movie);
            tittle = itemView.findViewById(R.id.tv_tittle);
        }
    }

}
