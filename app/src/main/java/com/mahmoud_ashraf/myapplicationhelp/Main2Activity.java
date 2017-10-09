package com.mahmoud_ashraf.myapplicationhelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private postsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<String> a = new ArrayList<>();
        a.add("#Polu");
        a.add("#Nunquam");
        a.add("#Navis");
        a.add("#Nunpez");
        a.add("#Polnomen.");
        a.add("#Nunja");
        a.add("#sesssso");

        adapter = new postsAdapter(a, this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
