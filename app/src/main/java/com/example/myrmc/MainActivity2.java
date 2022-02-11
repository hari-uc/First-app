package com.example.myrmc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

ConstraintLayout Con_id;
    Button togg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


Con_id=findViewById(R.id.cons_id);

         togg = findViewById(R.id.toggleButton2);


        togg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Con_id.setBackgroundColor(getResources().getColor(R.color.black));


            }
        });
    }
}