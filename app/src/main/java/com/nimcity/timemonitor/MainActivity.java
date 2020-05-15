package com.nimcity.timemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressPresentDayButton(View view) {
        Intent intent = new Intent(this,PresentDayActivity.class);
        this.startActivity(intent);
    }

    public void pressPreviousDaysButton(View view) {
        Intent intent = new Intent(this,PreviousDaysActivity.class);
        this.startActivity(intent);
    }
}
