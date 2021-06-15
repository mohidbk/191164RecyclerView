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
    LinearLayoutManager linearLayoutManager;
    List<marvel> marvelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marvelList.add(new marvel("Iron Man", 2008, 10));
        marvelList.add(new marvel("Incredible Hulk", 2008, 7));
        marvelList.add(new marvel("Iron Man 2", 2010, 8));
        marvelList.add(new marvel("Thor", 2011, 9));
        marvelList.add(new marvel("Captain America: The First Avenger",2011,8));
        marvelList.add(new marvel("The Avengers", 2012, 10));
        marvelList.add(new marvel("Iron Man 3", 2013, 9));
        marvelList.add(new marvel("Thor: The Dark World", 2013, 6));
        marvelList.add(new marvel("Captain America: Winter Soldier", 2014, 10));
        marvelList.add(new marvel("Guardians Of The Galaxy", 2014, 10));

        recyclerView = findViewById(R.id.rv_Marvel);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, marvelList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}