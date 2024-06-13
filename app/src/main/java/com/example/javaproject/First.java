package com.example.javaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class First extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        radioGroup = findViewById(R.id.radioGroup1);
    }

    public void handleOnClick(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedId);

        if (selectedRadioButton == null) {
            Toast.makeText(this, "Please select an answer.", Toast.LENGTH_SHORT).show();
            return;
        }

        int score = 0;

        if (selectedRadioButton.getId() == R.id.rb1) {
            score = score + 1;
        }

        // Pass the score value to the next activity
        Intent i = new Intent(getApplicationContext(), Second.class);
        String ans = String.valueOf(score);
        i.putExtra("val", ans);
        startActivity(i);
    }
}
