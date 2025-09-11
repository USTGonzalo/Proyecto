package com.example.myapplication;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SolicitudesActivity extends AppCompatActivity {

    LinearLayout containerLayout;
    String URL = "http://172.26.10.184:80/android/select.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitudes);

        containerLayout = findViewById(R.id.containerLayout);

        cargarBotones();
    }

    private void cargarBotones() {
        RequestQueue queue = Volley.newRequestQueue(this);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject obj = response.getJSONObject(i);

                                String id = obj.getString("ID_forms");
                                String nombre = obj.getString("name");
                                String email = obj.getString("email");
                                String telefono = obj.getString("Phone");
                                String mensaje = obj.getString("message");

                                //Creamos el boton
                                Button btn = new Button(SolicitudesActivity.this);
                                btn.setText(nombre);
                                btn.setId(Integer.parseInt(id));

                                //Aquí se le da diseño al boton
                                btn.setBackgroundResource(android.R.drawable.btn_default); // estilo base limpio
                                btn.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#2196F3"))); // azul minimalista
                                btn.setTextColor(Color.WHITE);
                                btn.setAllCaps(false);
                                btn.setTextSize(16f);

                                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                                        LinearLayout.LayoutParams.MATCH_PARENT,
                                        LinearLayout.LayoutParams.WRAP_CONTENT
                                );
                                params.setMargins(0, 16, 0, 0);
                                btn.setLayoutParams(params);


                                btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(SolicitudesActivity.this, InfoActivity.class);
                                        intent.putExtra("ID_forms", id);
                                        intent.putExtra("name", nombre);
                                        intent.putExtra("email", email);
                                        intent.putExtra("phone", telefono);
                                        intent.putExtra("message", mensaje);
                                        startActivity(intent);
                                    }
                                });

                                // Aqui se agrega el boton a la app
                                containerLayout.addView(btn);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(SolicitudesActivity.this, "Error: " + error, Toast.LENGTH_SHORT).show();
                    }
                }
        );

        queue.add(jsonArrayRequest);
    }
}
