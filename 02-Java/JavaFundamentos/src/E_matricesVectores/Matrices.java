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
public class Matrices {
    public static void main(String[] args) {

        // Izquierda: FILAS | Derecha: COLUMNAS
        int matriz [][] = new int[3][3];

        // Asignacion manual
        // matriz[0][0] = 1;
        // matriz[0][1] = 2;
        // matriz[0][2] = 3;
        // matriz[1][0] = 4;
        // matriz[1][1] = 5;
        // matriz[1][2] = 6;
        // matriz[2][0] = 7;
        // matriz[2][1] = 8;
        // matriz[2][2] = 9;

        Scanner input = new Scanner(System.in);
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posicion ["+ i +"]["+j+"]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        input.close();

        System.out.println("------------------------------------------");

        // Recorrido
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posicion ["+ i +"]["+j+"]: "+ matriz[i][j]);
            }
        }
    }
}
