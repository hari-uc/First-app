package com.example.myrmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usrname;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        usrname = findViewById(R.id.username);
        pass = findViewById(R.id.userpass);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String name = usrname.getText().toString();
            String passw = pass.getText().toString();

                //Log.d("test",passw);

            if(name.equals("hari") && passw.equals("hari123")){
                Toast.makeText(getApplicationContext(),"succesfully logged in",Toast.LENGTH_SHORT).show();
                Intent newi = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(newi);
            }else{
                Toast.makeText(getApplicationContext(),"Incorrect Username or password !!",Toast.LENGTH_SHORT).show();
            }



            }
        });




    }
}