package com.company.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addition = findViewById(R.id.buttonAdd);
        subtraction = findViewById(R.id.buttonSub);
        multiplication = findViewById(R.id.buttonMulti);
        division = findViewById(R.id.buttonDiv);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
                finish();

            }
        });


        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}