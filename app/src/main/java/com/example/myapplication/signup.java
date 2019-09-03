package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class signup extends AppCompatActivity {

    ImageButton sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        sign=findViewById(R.id.back);
    }
    public void signbuttonpressed(View view) {
        Intent i=new Intent(signup.this,MainActivity.class);
        startActivity(i);
    }
    public void goBack(View view) {
        Intent i=new Intent(signup.this,MainActivity.class);
        startActivity(i);
    }
}
