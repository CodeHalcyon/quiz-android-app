package com.example.javaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        radioGroup = findViewById(R.id.radioGroup2);

        Bundle extra = getIntent().getExtras();
        assert extra != null;
        String value1 = extra.getString("val");
        System.out.println(value1);
    }

    public void q2Click(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedId);

        if (selectedRadioButton == null) {
            Toast.makeText(this, "Please select an answer.", Toast.LENGTH_SHORT).show();
            return;
        }
        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String val = extra.getString("val");
            int score = Integer.parseInt(val);
            if (selectedRadioButton.getId() == R.id.q2rb1) {
                score = score + 1;
            }
            Intent i = new Intent(getApplicationContext(), Third.class);
            String ans = String.valueOf(score);
            System.out.println("score in 2nd question is: " + ans);
            i.putExtra("val", ans);
            startActivity(i);
        }
    }
}
