package com.example.delights;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button register_2 = findViewById(R.id.register_2);
        register_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this,Fetch.class);
                startActivity(i);
                Toast.makeText(Register.this, "You have been Successfully Registered", Toast.LENGTH_SHORT).show();
            }
        });


    }
}