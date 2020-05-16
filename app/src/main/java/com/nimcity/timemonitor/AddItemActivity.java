package com.nimcity.timemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddItemActivity extends AppCompatActivity {

    EditText itemNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        itemNameEditText = findViewById(R.id.add_item_screen_edit_text);
    }

    public void pressSaveButton(View view) {
        String itemName = itemNameEditText.getText().toString();
        finish();
    }

    public void pressCancelButton(View view) {
        finish();
    }
}
