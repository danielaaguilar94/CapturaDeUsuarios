package com.example.capturadeusuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enviar = findViewById(R.id.botonEnviar);
        enviar.setOnClickListener(botonEnviarListener);

        Button limpiar = findViewById(R.id.botonLimpiar);
        limpiar.setOnClickListener(botonLimpiarListener);
    }
    private View.OnClickListener botonEnviarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            EditText textNombre = findViewById(R.id.editTextNombre);
            String nombre = textNombre.getText().toString();

            TextView tvNombre = findViewById(R.id.textViewResNombre);
            tvNombre.setText(getString(R.string.nombre)+nombre);
            //tvNombre.setText(nombre);

            EditText textApellido = findViewById(R.id.editTextApellido);
            String apellido = textApellido.getText().toString();

            TextView tvApellido = findViewById(R.id.textViewResApellido);
            tvApellido.setText(getString(R.string.apellido)+apellido);
            //tvApellido.setText(apellido);

            EditText textTelefono = findViewById(R.id.editTextTelefono);
            String telefono = textTelefono.getText().toString();

            TextView tvTelefono = findViewById(R.id.textViewResTelefono);
            tvTelefono.setText(getString(R.string.telefono)+telefono);
            //tvTelefono.setText(telefono);

            EditText textCorreo = findViewById(R.id.editTextCorreo);
            String correo = textCorreo.getText().toString();

            TextView tvCorreo = findViewById(R.id.textViewResCorreo);
            tvCorreo.setText(getString(R.string.correo)+correo);
            //tvCorreo.setText(correo);
        }
    };

    private View.OnClickListener botonLimpiarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            EditText textNombre = findViewById(R.id.editTextNombre);
            textNombre.setText("");
            TextView tvNombre = findViewById(R.id.textViewResNombre);
            tvNombre.setText("");

            EditText textApellido = findViewById(R.id.editTextApellido);
            textApellido.setText("");
            TextView tvApellido = findViewById(R.id.textViewResApellido);
            tvApellido.setText("");

            EditText textTelefono = findViewById(R.id.editTextTelefono);
            textTelefono.setText("");
            TextView tvTelefono = findViewById(R.id.textViewResTelefono);
            tvTelefono.setText("");

            EditText textCorreo = findViewById(R.id.editTextCorreo);
            textCorreo.setText("");
            TextView tvCorreo = findViewById(R.id.textViewResCorreo);
            tvCorreo.setText("");
        }
    };
}
