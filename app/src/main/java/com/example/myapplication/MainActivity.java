package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RecyclerView recyclerView2;
    public RecyclerView recyclerView3;
    public ArrayList<MovieModel> imageModelArrayList;
    public ArrayList<MenuModel> imageModelArrayList2;
    public ArrayList<PlaylistModel> imageModelArrayList3;
    public MovieAdapter adapter;
    public MenuAdapter adapter2;
    public PlaylistAdapter adapter4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);
        recyclerView2 = findViewById(R.id.rv_menu);
        recyclerView3 = findViewById(R.id.rv_playlist);

        imageModelArrayList = new ArrayList<>();
        imageModelArrayList2 = new ArrayList<>();
        imageModelArrayList3 = new ArrayList<>();

        for (int i = 0; i < 1; i++){
            imageModelArrayList.add(new MovieModel("Infinity War", R.drawable.infinitywar));
            imageModelArrayList.add(new MovieModel("Age of Ultron", R.drawable.ageofultron));
            imageModelArrayList.add(new MovieModel("Civil War", R.drawable.civilwar));
            imageModelArrayList.add(new MovieModel("End Game", R.drawable.endgame));

        }

        adapter = new MovieAdapter(this, imageModelArrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        for (int x = 0; x < 1; x ++){
            imageModelArrayList2.add(new MenuModel("History", R.drawable.history));
            imageModelArrayList2.add(new MenuModel("Downloads", R.drawable.download));
            imageModelArrayList2.add(new MenuModel("My Videos", R.drawable.youtube));
            imageModelArrayList2.add(new MenuModel("Watch Later", R.drawable.clock));
        }

        adapter2 = new MenuAdapter(this, imageModelArrayList2);

        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView2.setAdapter(adapter2);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.Filter, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter3);

        for (int y = 0; y < 1; y ++){
            imageModelArrayList3.add(new PlaylistModel("Liked Videos", R.drawable.like));
        }

        adapter4 = new PlaylistAdapter(this, imageModelArrayList3);

        recyclerView3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView3.setAdapter(adapter4);
    }

}
