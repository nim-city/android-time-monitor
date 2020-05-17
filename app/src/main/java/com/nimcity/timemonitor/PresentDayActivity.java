package com.nimcity.timemonitor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PresentDayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private Item[] itemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_day);

        // Set up toolbar
        Toolbar toolbar = findViewById(R.id.present_day_screen_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Load in some data
        itemsList = new Item[3];
        itemsList[0] = new Item("Item 1");
        itemsList[1] = new Item("Item 2");
        itemsList[2] = new Item("Item 3");

        // Set up the recycler view
        recyclerView = findViewById(R.id.present_day_screen_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(itemsList);
        recyclerView.setAdapter(adapter);
    }

    public void pressFloatingActionButton(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }
}
