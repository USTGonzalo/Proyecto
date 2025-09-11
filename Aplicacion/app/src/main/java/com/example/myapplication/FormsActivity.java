package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class FormsActivity extends AppCompatActivity {

    EditText name, email, phone, message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forms);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        name = findViewById(R.id.TXT_name);
        email = findViewById(R.id.TXT_email);
        phone = findViewById(R.id.TXT_phone);
        message = findViewById(R.id.TXT_message);
        Button sendForms = findViewById(R.id.BTN_send);
        sendForms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Dirección de mi localhost con XAMPP, cambiar si es necesario. (PHP en repositorio)
                executeService("http://172.26.10.184:80/android/insertar.php");
            }
        });
        Button Back = findViewById(R.id.BTN_back);
        Back.setOnClickListener(v -> finish());
    }

    private void executeService(String URL){
        //Resultado de las peticiones
        StringRequest stringrequest = new StringRequest(Request.Method.POST, URL,
                response -> Toast.makeText(getApplicationContext(), "Operación exitosa", Toast.LENGTH_SHORT).show(),
                error -> Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show()
        ){
            //Asignar parametros y hacer la request a la página.
            @NonNull
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<>();
                parametros.put("name", name.getText().toString());
                parametros.put("email", email.getText().toString());
                parametros.put("phone", phone.getText().toString());
                parametros.put("message", message.getText().toString());
                return parametros;
            }
        };
        RequestQueue request = Volley.newRequestQueue(this);
        request.add(stringrequest);
    }
}
