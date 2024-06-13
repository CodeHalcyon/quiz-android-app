package com.example.javaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Fourth extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);

        radioGroup = findViewById(R.id.radioGroup);
    }

    public void q4OnClick(View view) {
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

            if (selectedRadioButton.getId() == R.id.q4rb4) {
                n = n + 1;
            }

            Intent i = new Intent(getApplicationContext(), Fifth.class);
            ans = String.valueOf(n);
            i.putExtra("val", ans);
            startActivity(i);
        }
    }
}
