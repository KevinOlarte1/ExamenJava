package com.kevinolarte.cine;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import lib.Fakers;
import lib.Fechas;

public class Proyeccion {

    private final Pelicula pelicula;
    private final LocalTime hora;
    private final LocalDate fechaProyeccion;
    private final Asiento asientos[];

    public Proyeccion(Pelicula pelicula, LocalDate fecha, LocalTime hora, Asiento[] asientos){
        this.pelicula = pelicula;
        this.fechaProyeccion = fecha;
        this.hora = hora;
        this.asientos= asientos;
    }
   
    
    
}