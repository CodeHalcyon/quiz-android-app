package com.example.javaproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Eighth extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eight);
        TextView tv = (TextView)findViewById(R.id.tt);
        Bundle extra = getIntent().getExtras();
        tv.setText(extra.getString("val"));
    }
}
