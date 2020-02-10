package com.example.myprojectexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my1);
    }
    public void openActivty2(View view){
        Intent intent = new Intent (this, MyActivity2.class);
        startActivity(intent);
    }
}
