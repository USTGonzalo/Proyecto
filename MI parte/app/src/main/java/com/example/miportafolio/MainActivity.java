package com.example.miportafolio;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
// Se eliminan las importaciones de Intent, Uri, Toast, etc. que ya no se usan

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se eliminan las referencias a los LinearLayouts de contacto
        Button backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(v -> {
            //noinspection deprecation
            onBackPressed();
        });
    }
}