package com.example.a191164_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<marvel> marvelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marvelList.add(new marvel("Iron Man"));
        marvelList.add(new marvel("Incredible Hulk"));
        marvelList.add(new marvel("Iron Man 2"));
        marvelList.add(new marvel("Thor"));
        marvelList.add(new marvel("Captain America: The First Avenger"));
        marvelList.add(new marvel("The Avengers"));
        marvelList.add(new marvel("Iron Man 3"));
        marvelList.add(new marvel("Thor: The Dark World"));
        marvelList.add(new marvel("Captain America: Winter Soldier"));
        marvelList.add(new marvel("Guardians Of The Galaxy"));

        recyclerView = findViewById(R.id.rv_Marvel);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, marvelList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}