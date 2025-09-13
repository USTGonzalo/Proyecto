package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class INavarreteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inavarrete);
        Button volver = findViewById(R.id.Back);
        volver.setOnClickListener(v -> finish());

        GridView gridView = findViewById(R.id.languages_grid);

        // Datos random de ejemplo
        String[] datos = {
                "Java", "Python", "C#", "HTML",
                "CSS", "JavaScript", "Kotlin", "Swift",
                "Ruby", "Go", "PHP", "Rust"
        };

        // Adaptador simple con layout integrado de Android
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                datos
        );

        // Asignar el adaptador al GridView
        gridView.setAdapter(adapter);


    }

}