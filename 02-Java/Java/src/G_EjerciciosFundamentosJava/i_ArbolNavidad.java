/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_EjerciciosFundamentosJava;
import java.util.Scanner;

/**
Datos importanes:
* N° de filas
* Espacios que arranca con -1
* termina en 0
* asteriscos con la proporcion de impares
 */
public class i_ArbolNavidad {
    public static void main(String[] args) {
        int altura;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la altura del arbol: ");
        altura = input.nextInt();
        
        for (int fila = 0; fila < altura; fila++) {
            for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
                System.out.print(" ");
            }
            
            for (int aste = 0; aste < (fila*2)+1; aste++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
