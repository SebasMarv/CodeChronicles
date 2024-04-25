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
        
        // Venta de asientos
        
        Scanner input2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;
        
        while (!bandera.equalsIgnoreCase("finish")){
            System.out.println("Ingrese el N° de destino");
            destino = input2.nextInt();
            System.out.println("Ingrese el horario de vuelo");
            horario = input2.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = input2.nextInt();
            
            if (vuelos[destino][horario] >= asientos) {
                System.out.println("Su reserva fue realizada con exito");
                vuelos[destino][horario] = vuelos[destino][horario] - asientos;
            } else {
                System.out.println("No hay asientos disponibles");
            }
            
            System.out.println("¿Desea continuar reservando?. Ingrese finish para terminar o "+
                    "cualquier valor.");
        }
    }
}
