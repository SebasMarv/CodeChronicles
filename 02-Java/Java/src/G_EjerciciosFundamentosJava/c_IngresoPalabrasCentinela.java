/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_EjerciciosFundamentosJava;

import java.util.Scanner;

/*
Realizar un programa que muestre en pantalla palabras
que sean ingresadas por teclado hasta que se ingrese
la palabra salir.
*/
public class c_IngresoPalabrasCentinela {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra:");
        Scanner input = new Scanner(System.in);
        
        String word = input.next();
        
//        equals sirve para poder comparar una variable String con una palabra 
//        ingresada con Scanner o de la fuente de donde provenga.
//        while (!word.equals("salir")) {            
//            System.out.println("La palabra es: "+word);
//            word = input.next();
//        }


//        Que pasa si el usuario ingresa su palabra con mayuscula, se puede
//        controlar con equalsIgnoreCase.
        while (!word.equalsIgnoreCase("salir")) {            
            System.out.println("La palabra es: "+word);
            word = input.next();
        }
        System.out.println("Fin de bucle, se detecto la palabra 'salir'");
        
        
//        int cent = 0, cont;
//        String word;
//        
//        Scanner input = new Scanner(System.in);
//        
//        while (cent==2) {         
//            System.out.println("Deseas seguir [1] o deseas parar [2]");
//            cent = input.nextInt();
//            if (cent==1) {
//                System.out.println("Ingrese su palabra:");
//                word = input.next();
//                System.out.println("Su palabra es: **"+word+"**");
//            } else {
//                System.out.println("Se termina el proceso");
//            }
//        }
    }
}
