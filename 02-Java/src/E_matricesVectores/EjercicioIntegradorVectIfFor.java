package E_matricesVectores;

import java.util.Scanner;

/* Realizar un programa que permita cargar 15 números en un vector. Una vez
cargados, se necesita que el programa cuente e informe por pantalla cuántas
veces se cargó el número 3*/

public class EjercicioIntegradorVectIfFor {
    public static void main(String[] args) {
        int vector [] = new int[15];

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la opción [1-Seguir] o [2-No seguir]");
        int desi = input.nextInt();
        if (desi == 1) {
            for (int i=0; i<15; i++) {
                System.out.println("Ingrese su numero en la posición ["+ i + "]");
                vector[i] = input.nextInt();
            }
            System.out.println("-----------------------------------------------");
            for (int i=0; i<=vector.length; i++) {
                if (vector[i] == 3) {
                    System.out.println("El numero de posición ["+ i + "] es: "+ vector[i]);
                } else {
                    ;
                }
            }
        } else if (desi == 2) {
            System.out.println("Hasta luego");
        } else {
            System.out.println("Ingrese un numero valido.");
        }
        input.close();
    }
}
