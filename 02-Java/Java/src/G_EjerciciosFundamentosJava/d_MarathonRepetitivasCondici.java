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
    
    //Fin del ciclo
    // 
    public static void main(String[] args) {
        int dni=0, edad;
        String nombre="";
        
        while (dni == 0 && nombre == "fin") {            
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese su dni: ");
            dni = input.nextInt();
            System.out.println("Ingrese su nombre: ");
            nombre = input.next();
            System.out.println("Ingrese su edad: ");
            edad = input.nextInt();
            
            switch (edad) {
                case edad :
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
