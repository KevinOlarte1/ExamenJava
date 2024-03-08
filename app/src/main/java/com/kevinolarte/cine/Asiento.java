package com.kevinolarte.cine;

public class Asiento {
    private static int CONT = 0;
    private static String letras = "ABCDEFGHIJKLMNOPQRSTU";
    private final String id;
    private final String idInterno;
    private String entrada;
    public Asiento(int fila, int columna){
        idInterno = String.valueOf(++CONT);
        id = String.valueOf(fila) + letras.charAt(columna);
        entrada = null;
    }
    

    
}
