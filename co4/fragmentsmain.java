package com.example.gragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Button btnchat=findViewById(R.id.bt1);
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,fragment1.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();

            }
        });Button btnstatus=findViewById(R.id.bt2);
        btnstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,fragment2.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();

            }
        });Button btncall=findViewById(R.id.bt3);
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,fargment3.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();

            }
        });

    }
}
