package com.example.javaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Seventh extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh);

        radioGroup = findViewById(R.id.radioGroup1);  // Make sure this ID matches your RadioGroup ID in XML
    }

    public void q7OnClick(View view) {
        // Find the selected radio button within the radio group
        int selectedId = radioGroup.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedId);

        if (selectedRadioButton == null) {
            Toast.makeText(this, "Please select an answer.", Toast.LENGTH_SHORT).show();
            return;
        }

        Bundle extras = getIntent().getExtras();
        String val = extras.getString("val");
        int score = Integer.parseInt(val);

        if (selectedRadioButton.getId() == R.id.radioButton20) {
            score = score + 1;
        }
        Intent i = new Intent(getApplicationContext(), Eighth.class);  // Assuming Eighth is your next activity
        String ans = String.valueOf(score);
        i.putExtra("val", ans);
        startActivity(i);
    }
}
