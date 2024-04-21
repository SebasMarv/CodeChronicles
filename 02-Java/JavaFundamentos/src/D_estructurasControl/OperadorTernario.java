/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_estructurasControl;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class OperadorTernario {
    public static void main(String[] args) {
        
        double promedio;
        String condicionFinal;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el promedio general del alumno en TodoCode");
        promedio = input.nextDouble();
        input.close();

        condicionFinal = promedio >= 6 && promedio <= 10 ? "Aprobado" : "Desaprobado";
        System.out.println(condicionFinal);
        
    }
}
