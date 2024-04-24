package G_EjerciciosFundamentosJava;

import java.util.Scanner;

public class h_EmpresaVuelos {
    public static void main(String[] args) {
        int [][] vuelos = new int[6][3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresa la cantidad de asientes para el destino "+j+" del vuelo "+i);
                vuelos[i][j] = input.nextInt();
            }
        }
    }
}
