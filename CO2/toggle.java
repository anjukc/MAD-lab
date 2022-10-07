package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

public class toggle extends AppCompatActivity {
    ImageView img11,img22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        img11=findViewById(R.id.image11);
        img22=findViewById(R.id.image22);
        img11.setOnClickListener(this::onClick);
        img22.setOnClickListener(this::onClick);
}

    private void onClick(View view) {
        if(view.getId()==R.id.image22){
            img22.setVisibility(view.GONE);
            img11.setVisibility(view.VISIBLE);
        }
        else {
            img22.setVisibility(view.VISIBLE);
            img11.setVisibility(view.GONE);
        }
    }
    }
