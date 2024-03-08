package com.kevinolarte.cine;

public class Pelicula {
    private static int CONT = 0;
    private final String id;
    private final String nombre;
    private final float precio;
    private final int duracion;

    public Pelicula(String nombre, float precio, int duracion){
        this.id = String.valueOf(++CONT);
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }
    

}
