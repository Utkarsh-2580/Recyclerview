package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    RecyclerviewAdapter recycleradapter;

    List<String> namelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namelist = new ArrayList<>();

        recyclerview = findViewById(R.id.recyclerview);
        recycleradapter = new RecyclerviewAdapter(namelist);

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(recycleradapter);


        //FOR LINE BETWEEN TWO RECYCLERVIEW
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerview.addItemDecoration(dividerItemDecoration);

        namelist.add("Utkarsh Parekh");
        namelist.add("sanjay Parekh");
        namelist.add("twara Parekh");
        namelist.add("varsha Parekh");
        namelist.add("Himani Parekh");

        namelist.add("Utkarsh Parekh - 1");
        namelist.add("sanjay Parekh - 2");
        namelist.add("twara Parekh- 3");
        namelist.add("varsha Parekh- 4");
        namelist.add("Himani Parekh- 5");

        namelist.add("Utkarsh Parekh");
        namelist.add("sanjay Parekh");
        namelist.add("twara Parekh");
        namelist.add("varsha Parekh");
        namelist.add("Himani Parekh");

        namelist.add("Utkarsh Parekh - 1");
        namelist.add("sanjay Parekh - 2");
        namelist.add("twara Parekh- 3");
        namelist.add("varsha Parekh- 4");
        namelist.add("Himani Parekh- 5");



    }
}