package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtCodigo, edtNombre, edtDescripcion; Button btnAgregar, btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCodigo = (EditText)findViewById(R.id.edtCodigo);
        edtNombre = (EditText)findViewById(R.id.edtNombre);
        edtDescripcion = (EditText)findViewById(R.id.edtDes);
        btnAgregar =(Button)findViewById(R.id.btnAgregar);
        btnMostrar = (Button)findViewById(R.id.btnMostrar);
        final BaseDatos baseDatos = new BaseDatos(getApplicationContext());

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseDatos.agregarLugarComida(edtCodigo.getText().toString(), edtNombre.getText().toString(),edtDescripcion.getText().toString());
                Toast.makeText(getApplicationContext(), "Datos agregados correctamente",Toast.LENGTH_SHORT).show();
            }
        });
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obtenerComida = new Intent(getApplicationContext(),CursoActivity.class);
                startActivity(obtenerComida);
            }
        });
    }



}
