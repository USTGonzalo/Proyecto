package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        Button GoForms = findViewById(R.id.BTN_forms);

        GoForms.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FormsActivity.class);
            startActivity(intent);
        });

        ImageButton GoGonzalo = findViewById(R.id.IMGB_GF);
        GoGonzalo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GFuentesActivity.class);
            startActivity(intent);
        });

        ImageButton GoAaron = findViewById(R.id.IMGB_AC);
        GoAaron.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ACentenoActivity.class);
            startActivity(intent);
        });

        ImageButton GoBenjamin = findViewById(R.id.IMGB_BP);
        GoBenjamin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BPizarroActivity.class);
            startActivity(intent);
        });

        ImageButton GoIgnacio = findViewById(R.id.IMGB_IN);
        GoIgnacio.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, INavarreteActivity.class);
            startActivity(intent);
        });

        Button Solicitudes = findViewById(R.id.BTN_solis);
        Solicitudes.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SolicitudesActivity.class);
            startActivity(intent);
        });
    }
}