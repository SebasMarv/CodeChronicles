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
public class EjercicioIntegradorOne {

    public static void main(String[] args) {
        //Categorias 1.repositor | 2.cajero | 3.supervisor
        // double sueldo;
        // int categoria;

        // System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
        // Scanner teclado = new Scanner(System.in);
        // categoria = teclado.nextInt();

        // if (categoria == 1) {
        //     sueldo = 15890 + (15890 * 0.10);
        //     System.out.println("Su sueldo final como " + "repositor es: " + sueldo);
        // } else {
        //     if (categoria == 2) {
        //         sueldo = 25630.89;
        //         System.out.println("Su sueldo final como " + "cajero es: " + sueldo);
        //     } else {
        //         if (categoria == 3) {
        //             sueldo = 35560.20 + (35560.20 * 0.11);
        //             System.out.println("Su sueldo final como " + "supervisor es: " + sueldo);
        //         } else {
        //             System.out.println("Debe ingresar un numero de categoria valido!");
        //         }
        //     }
        // }

        // Una pequeña despensa desea calcular los sueldos de sus empleados. Los puesto
        // de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3- supervisor.
        // • Los repositores cobran $15.690 + un bono del 10%
        // • Los cajeros cobran $25.630,89 fijos
        // • Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 1196
        // de jubilación.
        // Se necesita un programa que, dependiendo del tipo de empleado
        // del que se trate, calcule y muestre en pantalla el
        // correspondiente sueldo.


        //Utilizando swtich
        
        // int categorias;
        // double sueldo;
        
        // System.out.println("Ingrese la categoria deseada: ");
        // Scanner input = new Scanner(System.in);
        // categorias = input.nextInt();
        
        // input.close();

        // switch (categorias) {
        //     case 1:
        //         sueldo = 15690 + (15690*0.10);
        //         System.out.println(sueldo);
        //         break;
        //     case 2:
        //         sueldo = 25630.89;
        //         System.out.println(sueldo);
        //         break;
        //     case 3:
        //         sueldo = 35560.20 - 1196;
        //         System.out.println(sueldo);
        //         break;
        //     default:
        //         System.out.println("Ingrese un caracter valido por favor!");
        //         break;
        // }

        // Una pequeña despensa desea calcular los sueldos de sus empleados. Los puesto
        // de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3- supervisor.
        // • Los repositores cobran $15.690 + un bono del 10%
        // • Los cajeros cobran $25.630,89 fijos
        // • Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 1196
        // de jubilación.
        // Se necesita un programa que, dependiendo del tipo de empleado
        // del que se trate, calcule y muestre en pantalla el
        // correspondiente sueldo.


        //Utilizando else if
        
        int categoria;
        double sueldo;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la categoria: [ 1-repositor | 2-cajero | 3-supervisor]");
        categoria = input.nextInt();

        input.close();

        if (categoria == 1) {
            sueldo = 15690 + (15690 * 0.10);
            System.out.println("El repositor tiene un sueldo de: S/" + sueldo);
        } else if (categoria == 2) {
            sueldo = 25630.89;
            System.out.println("El cajero tiene un sueldo de: S/" + sueldo);
        } else if (categoria == 3) {
            sueldo = 35560.20 - 1196;
            System.out.println("El supervisor tiene un sueldo de: S/" + sueldo);
        } else {
            System.out.println("Ingrese un valor valido por favor!");
        }

    }
}
