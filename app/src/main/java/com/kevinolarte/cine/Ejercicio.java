package com.kevinolarte.cine;

import lib.Fakers;
import lib.Randoms;

public class Ejercicio {
    Pelicula[] peliculas;

    public Ejercicio(){
        peliculas = new Pelicula[20];
        int ingreso = 0;
        do{
            lib.Menus.print(new String[]{" GESTION DE ENTRADAS ","Vender entrada", "Buscar asiento libres consecutivos", "Mostrar recaudacion semanal"});
            ingreso = lib.Inputs.pedirIntPositivo("Ingrese un valor entre el 0-3");
            switch (ingreso) {
                case 1:
                    venderEntrada();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    lib.Conf.sleep(300);
                    break;
            
                default:
                    System.out.println("Ingreso no valido");
                    lib.Conf.sleep(500);
                    break;
            }
        }while(ingreso != 0);
    }

    private void venderEntrada(){
        
    }





    private void generadorAleatorio(int pelis){
        generarPeliculas(pelis);
    }

    private void generarPeliculas(int cant){
        if(cant <= peliculas.length){
            for (int i = 0; i < cant; i++) {
               peliculas[i] = new Pelicula(Fakers.faker.name().firstName(), Randoms.rnd.nextFloat(5, 10), Randoms.rnd.nextInt(100, 180));
            }
        }
    }
}
