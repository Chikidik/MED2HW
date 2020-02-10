package com.example.myprojectexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/*
TODO: make it return to the first instance instead of making a new activity. Also make it close old activities to save more memory.

 */

public class MyActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my2);
    }
    public void mainActivity(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
