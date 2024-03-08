package com.kevinolarte.cine;

public class Pelicula {
    private static int CONT = 0;
    private final String id;
    private final String nombre;
    private final double precio;
    private final int duracion;

    public Pelicula(String nombre, double precio, int duracion){
        this.id = String.valueOf(++CONT);
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }
    public Pelicula(){
        this(lib.Fakers.faker.name().firstName(),lib.Randoms.rnd.nextDouble(0, 10), lib.Randoms.rnd.nextInt(0, 20));
    }

}
