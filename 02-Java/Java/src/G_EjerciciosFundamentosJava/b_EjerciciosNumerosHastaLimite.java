
package G_EjerciciosFundamentosJava;

import java.util.Scanner;

/**
Realizar un programa que dado por teclado un límite numérico
por teclado (por ejemplo 100) muestre en pantalla todos
los números hasta ese límite (empezando por 1) .
 */
public class b_EjerciciosNumerosHastaLimite {
    public static void main(String[] args) {
        
        // Forma con for
        /*
        int limit;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero limite de caracteres a iterar:");
        limit = input.nextInt();
        System.out.println("-----------------------------");
        for (int i = 1; i <= limit; i++) {
            System.out.println("Numero: "+i);
        }
        System.out.println("-----------------------------");
        System.out.println("Se termino de iterar los "+limit+" numeros");
        */
        
        // Forma con while
        int limit = 1, i=1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero limite de caracteres a iterar:");
        limit = input.nextInt();
        System.out.println("-----------------------------");
        
        while (i<=limit) {            
            System.out.println("Numero: "+i);
            i++;
        }
        System.out.println("-----------------------------");
        System.out.println("Se termino de iterar desde 1 hasta el "+limit);

        input.close();
    }
}
