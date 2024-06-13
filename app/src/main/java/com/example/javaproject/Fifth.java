package com.example.javaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Fifth extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);

        radioGroup = findViewById(R.id.radioGroup);
    }

    public void q5OnClick(View view) {
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

            if (selectedRadioButton.getId() == R.id.q5rb1) {
                n = n + 1;
            }
            Intent i = new Intent(getApplicationContext(), Sixth.class);
            ans = String.valueOf(n);
            i.putExtra("val", ans);
            startActivity(i);
        }
    }
}
