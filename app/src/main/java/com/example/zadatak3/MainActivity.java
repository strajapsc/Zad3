package com.example.zadatak3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView gimnazija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gimnazija = (TextView) findViewById(R.id.textViewGimnazija);
    }

    public void gimnClick(View view) {
        gimnazija.setText("Radi!");
    }
}