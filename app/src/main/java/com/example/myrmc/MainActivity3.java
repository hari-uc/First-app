package com.example.myrmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    SharedPreferences sharedPreferences;

    Button create_acc_button;
    EditText new_user_name;
    List<String> experience =new ArrayList<>();
    int user_selected_filed;
    Toast toast;



    ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        experience.add("fresher");
        experience.add("entry level");
        experience.add("experienced");
        Spinner spinnerexp = findViewById(R.id.dropdown);


        create_acc_button = findViewById(R.id.create_acc_button);
        new_user_name = findViewById(R.id.r_usr_name);

        arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,experience);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerexp.setAdapter(arrayAdapter);

//        arrayAdapter = ArrayAdapter.createFromResource(this,R.array.experience, android.R.layout.simple_spinner_item);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
//        spinnerexp.setAdapter(arrayAdapter);


        create_acc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String new_usr_string = new_user_name.getText().toString();

                sharedPreferences = getSharedPreferences("USERDATA",MODE_PRIVATE);

                SharedPreferences.Editor put_editor = sharedPreferences.edit();
                put_editor.putString("new_user_name",new_usr_string);




            }
        });



//        spinnerexp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                user_selected_filed = i;
//                String label = adapterView.getSelectedItem().toString();
//                toast = Toast.makeText(getApplicationContext(),"position "+ label,Toast.LENGTH_SHORT);
//
//            }
//        });


        spinnerexp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
                                             {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String label = adapterView.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),"position "+ label,Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
//        new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                user_selected_filed = i;
//                String label = adapterView.getSelectedItem().toString();
//                toast = Toast.makeText(getApplicationContext(),"position "+ label,Toast.LENGTH_SHORT);
//
//            }
//        });

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String label = adapterView.getSelectedItem().toString();
        toast = Toast.makeText(MainActivity3.this,"position "+ label,Toast.LENGTH_SHORT);


    }
}