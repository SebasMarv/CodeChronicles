/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_EjerciciosFundamentosJava;

import java.util.Scanner;

public class d_MarathonRepetitivasCondici {
    // El evento cuenta con un dia de inscripciones el cual
    // es un dia anterior a la carrera, por lo que se 
    // se desconoce cuantos participantes pueden existir
    
    // Requisitos: dni, nombre y edad
    // Categorias: 
    // Menores A (de 6 a 10 años)
    // Menores B (de 11 a 17 años)
    // Juveniles (de 18 a 30 años)
    // Adultos (de 31 a 50 años)
    // Adultos mayores (mayores de 50 años)
    
    // Fin del ciclo
    // 
    public static void main(String[] args) {
        int edad;
        String nombre, categoria = "", dni;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su dni: ");
        dni = input.next();
        System.out.println("Ingrese su nombre: ");
        nombre = input.next();
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        
        while ((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))) {            
            
            if (edad >= 6 && edad <=10) {
                categoria = "Menores A";
            } else if (edad >= 11 && edad <= 17) {
                categoria = "Menores B";
            } else if (edad >= 18 && edad <=30) {
                categoria = "Juveniles";
            } else if (edad >= 31 && edad <= 50) {
                categoria = "Adultos";
            } else if (edad > 50 && edad < 100) {
                categoria = "Adultos mayores";
            } else {
                System.out.println("Ingrese un valor correcto !!");
            }
            
            System.out.println("Su categoria es (" + categoria + 
                    ") con los siguientes datos: \nDNI: "+ dni +
                    " | EDAD: "+ edad + " | NOMBRE: "+ nombre);
            
            System.out.println("Ingrese su dni: ");
            dni = input.next();
            System.out.println("Ingrese su nombre: ");
            nombre = input.next();
            System.out.println("Ingrese su edad: ");
            edad = input.nextInt();
        }
        
        input.close();
    }
}
