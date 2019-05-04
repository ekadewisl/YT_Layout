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

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<PlaylistModel> imageModelArayList3;


    public PlaylistAdapter(Context context, ArrayList<PlaylistModel> imageModelArayList3) {
        this.context = context;
        this.imageModelArayList3 = imageModelArayList3;
    }

    @NonNull
    @Override
    public PlaylistAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int y) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item3, viewGroup, false);
        PlaylistAdapter.MyViewHolder holder = new PlaylistAdapter.MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistAdapter.MyViewHolder myViewHolder, int y) {
        myViewHolder.img3.setImageResource(imageModelArayList3.get(y).getImgPlaylist());
        myViewHolder.playlist.setText(imageModelArayList3.get(y).getPlaylist());
    }

    @Override
    public int getItemCount() {
        return imageModelArayList3.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img3;
        public TextView playlist;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img3 = itemView.findViewById(R.id.img_playlist);
            playlist = itemView.findViewById(R.id.tv_playlist);
        }
    }
}
