package three_operadores;

// //Realizar un programa que permita el intercarnbio de valores entre dos variables.
// Por ejemplo: Si una variable numero vale 35, y una variable numer02 vale 20,
// realizar las acciones necesarias para que numero pase a valer 20 y numer02
// ase a valer 35. Una vez realizado el cambio mostrar
// eI resultado por pantalla.l

public class Ejercicio {
    public static void main(String[] args) {
        
        int num1, num2, auxiliar;

        num1 = 35;
        num2 = 20;

        System.out.println("Antes|" + "num1: " + num1 + " - um2: " + num2);
        
        auxiliar = num1;
        num1 = num2;
        num2 = auxiliar;
        
        System.out.println("Despues|" + "num1: " + num1 + " - num2: " + num2);
    }
}
// Intercambiar valores entre variables