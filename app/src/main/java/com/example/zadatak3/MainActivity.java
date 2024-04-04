package com.example.zadatak3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView gimnazija;
    TextView odeljenje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gimnazija = (TextView) findViewById(R.id.textViewGimnazija);
        odeljenje = (TextView) findViewById(R.id.textViewOdeljenje);
        odeljenje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                odeljenje.setText(odeljenje.getText() + " III5");
            }
        });
    }

    public void gimnClick(View view) {
        gimnazija.setText(gimnazija.getText() + " Pirot");
    }
}