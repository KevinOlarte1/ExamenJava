package com.kevinolarte.cine;

import com.kevinolarte.cine.TipoSala.tipo;

public class Entrada {
    private static int CONT = 0;
    private final String id;
    private final float precio;
    private final tipo tipoSala;
    private final Pelicula pelicula;

    public Entrada(float precio, tipo tipoSala, Pelicula pelicula){
        this.id = String.valueOf(++CONT);
        this.precio = precio;
        this.tipoSala = tipoSala;
        this.pelicula = pelicula;
    }



}
