package com.example.android.tallerandroid;

import java.io.Serializable;

/**
 * Created by Luis on 19/05/2016.
 */
public class Libro implements Serializable{
    String nombre;
    double costo;
    String autor;

    public Libro(String nombre, double costo, String autor) {
        this.nombre = nombre;
        this.costo = costo;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
