/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_matricesVectores;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EjercicioIntegradorMatrizIfFor {
    public static void main(String[] args) {
        double table [][] = new double[4][4];
        double suma = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("----------INICIO----------");

        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                System.out.println("Ingrese la nota numero ["+j+"] del alumno ["+i+"]: ");
                table[i][j] = input.nextInt();
                suma = suma + table[i][j];
            }
            table[i][3] = suma / 3;
            suma = 0.0;
        }

        for (int i=0; i<4; i++) {
            System.out.println("----------------------------------");
            System.out.println("Las notas del alumno: "+i+" son: ");
            for (int j=0; j<3; j++) {
                System.out.println("Nota N° "+ j +" es: "+table[i][j]);
            }
            System.out.println("El promedio de las notas es: "+ table[i][3]);
        }

        input.close();
    }
}
