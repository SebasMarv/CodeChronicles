package com.nicolassalgado;

import java.util.ArrayList;

// Por convencion las clases tienen mayuscula la primera letra

// public hace que se pueda ver la clase para su uso a diferencia de private u otros
public class Seleccion {
    // variable -> estado
    // comportamiento -> metodos

    // tipos de datos primitivos
    // int, byte, short, long, float, double, boolean, char

    // https://docs.oracle.com/javase/8/docs/api/allclasses-noframe.html

    String nombreEquipo;
    char grupo;
    boolean clasificadoACuartos;

    void imprimirEquipo() {
        System.out.println(nombreEquipo);
        System.out.println(grupo);
        System.out.println(clasificadoACuartos);
    }
    // static hace que se pueda ejecutar main sin crear un objeto
    // void significa regresar todo el metodo
    public static void main(String[] args) {
        
        // int numeroDeEquipos = 32;
        // System.out.println(numeroDeEquipos);

        // Creacion de objeto
        Seleccion argentina = new Seleccion();

        argentina.nombreEquipo = "Argentina";
        argentina.grupo = 'C';
        argentina.clasificadoACuartos = true;

        // argentina.imprimirEquipo();

        // if statement (bloque condicional)
        // if(argentina.clasificadoACuartos == true) {
        //     System.out.println("Clasificado");
        // }else if (argentina.clasificadoACuartos == false){
        //     System.out.println("Desclasificado");
        // }

        // bucle - loops

        // for - loop
        // for(int i = 1; i<=10; i++){
        //     System.out.println("Asiento: "+i);
        // };

        // while loop
        // int j = 0;
        // while(j<=10) {
        //     System.out.println("Asiento: "+j);
        //     j++;
        // }

        // Excepciones

        // int x = 0;
        // int z = 5;
        
        
        // try {
        //     System.out.println(z/x);
        // } catch (Exception exception) {
        //     System.out.println("Imposible dividir por cero");
        // }

        // API - Uilizar recursos externos

        ArrayList<String> selecciones = new ArrayList<>();
        selecciones.add("Francia");
        selecciones.add("Venezuela");
        selecciones.add("Brasil");
        selecciones.add("Marruecos");

        System.out.println(selecciones);
    }
}
