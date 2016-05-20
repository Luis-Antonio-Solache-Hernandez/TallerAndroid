package com.example.android.tallerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleLibro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_libro);
        Libro libro = (Libro)getIntent().getExtras().getSerializable("libro");
        TextView titulo = (TextView) findViewById(R.id.librot);
        TextView precio = (TextView) findViewById(R.id.librop);
        TextView autor = (TextView) findViewById(R.id.libroa);
        titulo.setText("Titulo: "+libro.getNombre());
        precio.setText("Precio: $"+libro.getCosto());
        autor.setText("Autor: "+libro.getAutor());
    }
}
