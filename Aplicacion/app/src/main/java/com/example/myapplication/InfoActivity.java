package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String id = getIntent().getStringExtra("ID_forms");
        String nombre = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String telefono = getIntent().getStringExtra("phone");
        String mensaje = getIntent().getStringExtra("message");

        TableLayout tableLayout = findViewById(R.id.tableLayout);

        addRow(tableLayout, "ID", id);
        addRow(tableLayout, "Nombre", nombre);
        addRow(tableLayout, "Email", email);
        addRow(tableLayout, "Teléfono", telefono);
        addRow(tableLayout, "Mensaje", mensaje);

        Button Back = findViewById(R.id.BTN_menu);
        Back.setOnClickListener(v -> finish());
    }

    private void addRow(TableLayout tableLayout, String key, String value) {
        TableRow row = new TableRow(this);

        //Ajustes de texto
        TextView keyView = new TextView(this);
        keyView.setText(key);
        keyView.setPadding(16, 16, 16, 16);
        keyView.setTextSize(16f);

        //Ajustes de texto
        TextView valueView = new TextView(this);
        valueView.setText(value);
        valueView.setPadding(16, 16, 16, 16);
        valueView.setTextSize(16f);

        // Salto de linea sino pasa de largo la pantalla
        valueView.setSingleLine(false);
        valueView.setEllipsize(null);
        valueView.setHorizontallyScrolling(false);

        // Para que se ajuste al espacio de la tabla
        valueView.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1f
        ));

        row.addView(keyView);
        row.addView(valueView);

        tableLayout.addView(row);
    }



}
