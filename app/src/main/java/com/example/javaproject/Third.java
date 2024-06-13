package com.example.javaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Third extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        radioGroup = findViewById(R.id.radioGroup3);
    }

    public void q3HandleClick(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedId);

        if (selectedRadioButton == null) {
            Toast.makeText(this, "Please select an answer.", Toast.LENGTH_SHORT).show();
            return;
        }

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String ans = extra.getString("val");
            int n = Integer.parseInt(ans);

            if (selectedRadioButton.getId() == R.id.q3rb3) {
                n = n + 1;
            }

            Intent i = new Intent(getApplicationContext(), Fourth.class);
            ans = String.valueOf(n);
            System.out.println("score in question 3 is: " + ans);
            i.putExtra("val", ans);
            startActivity(i);
        }
    }
}
