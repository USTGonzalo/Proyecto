package com.example.miportafolio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button whatsappButton = findViewById(R.id.whatsapp_button);

        whatsappButton.setOnClickListener(v -> {
            String phoneNumber = "+56981935620";
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
                startActivity(intent);
            } catch (Exception e) {
                // Manejar el caso en que WhatsApp no esté instalado
                // Puedes mostrar un Toast o un AlertDialog al usuario
            }
        });
    }
}