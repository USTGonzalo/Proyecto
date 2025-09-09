package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     ImageButton btnc;
     ImageButton btnjava;
     ImageButton btnhtml;
     ImageButton btnpyton;
     ImageButton btncc;
     ImageButton btnmsql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnc = findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
            }

        });


        btnjava = findViewById(R.id.btnjava);
        btnjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }

        });

        btnhtml = findViewById(R.id.btnhtlm);
        btnhtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(i);
            }

        });

        btnpyton = findViewById(R.id.btnpyton);
        btnpyton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(i);
            }

        });
        btncc = findViewById(R.id.btncc);
        btncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, MainActivity7.class);
                startActivity(i);
            }

        });
        btnmsql = findViewById(R.id.btnmsql);
        btnmsql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(i);
            }

        });

    }
}