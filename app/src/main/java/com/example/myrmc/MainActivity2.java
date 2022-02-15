package com.example.myrmc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {

ConstraintLayout Con_id;
    ToggleButton togg;
    Switch swit;
   // ImageView currentimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Con_id=findViewById(R.id.cons_id);

         swit = findViewById(R.id.switch1);
        // currentimage = findViewById(R.id.imageView2)



         swit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Boolean state = swit.isChecked();
                 if(state == true){

                     Con_id.setBackgroundColor(getResources().getColor(R.color.black));

                 }else{

                     Con_id.setBackgroundColor(getResources().getColor(R.color.white));
                 }
             }
         });

    }
}