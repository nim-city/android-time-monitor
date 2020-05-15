package com.nimcity.timemonitor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PresentDayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private String[] dataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_day);

        // Set up toolbar
        Toolbar toolbar = findViewById(R.id.present_day_screen_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Set up the recycler view
        recyclerView = findViewById(R.id.present_day_screen_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        dataset = new String[3];
        dataset[0] = "Item 1";
        dataset[1] = "Item 2";
        dataset[2] = "Item 3";
        adapter = new RecyclerViewAdapter(dataset);
        recyclerView.setAdapter(adapter);
    }
}
