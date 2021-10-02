package com.example.freindshipcalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText name, friendName;
    Button calculateButton;
    TextView percentageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        friendName = findViewById(R.id.friend_name);
        calculateButton = findViewById(R.id.calculateButton);
        percentageView = findViewById(R.id.percentage);

        calculateButton.setOnClickListener(view -> {
           if (!name.getText().toString().isEmpty() && !friendName.getText().toString().isEmpty()) {
               int percentage = new Random().nextInt(101);
               String percentageText = percentage+"%";
               percentageView.setText(percentageText);
           }
           else {
               percentageView.setText(null);
           }
        });
    }
}