package com.kevinolarte.cine;


import java.util.ArrayList;
import java.util.Random;

import com.kevinolarte.cine.TipoSala.tipo;

import lib.Randoms;

public class sala{
    private static int cont = 0;
    
    private final String id;
    private final tipo tipoSala;
    private final float anchoPantalla;
    private final int numeroFilas;
    private final int numeroColumnas;
    Proyeccion[] proyecciones;

    public sala(tipo tipoSala, float anchoPantalla, int numeroFilas, int numeroColumnas,Proyeccion[] proyeccions){
        id = String.valueOf(++cont);
        this.tipoSala = tipoSala;
        this.anchoPantalla = anchoPantalla;
        this.numeroFilas = numeroFilas;
        this.numeroColumnas = numeroColumnas;
        this.proyecciones = proyeccions;
    }


}
