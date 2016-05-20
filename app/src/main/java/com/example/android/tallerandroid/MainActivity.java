package com.example.android.tallerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void ClicBoton(View v){
        /*
        Toast.makeText(
                getApplicationContext(),
                campo1.getText(),
                Toast.LENGTH_LONG).show();
    */
        //TextView campo1 = (EditText) findViewById(R.id.campo1);
        Libro libro = new Libro("La historia del loco", 200, "Juanito");

        Intent intento = new Intent(this, DetalleLibro.class);
        intento.putExtra("libro", libro);
        startActivity(intento);
    }

}
