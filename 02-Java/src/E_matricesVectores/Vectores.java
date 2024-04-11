package E_matricesVectores;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        // Declaración de vectores
        int vector [] = new int [4];

        //Asignacion manual
        // vector[0] = 2;
        // vector[1] = 34;
        // vector[2] = 12;
        // vector[3] = 99;

        //Asignación por entrada del usuario
        Scanner input = new Scanner(System.in);

        for (int cont = 0; cont < vector.length; cont++) {
            System.out.println("Ingrese el valor en el indice: "+cont);
            vector[cont] = input.nextInt();
        }

        input.close();

        // Recorrido del vector
        // Con length puedo obtener el numero de indice que tenga el vector
        for (int cont = 0; cont < vector.length; cont++){
            System.out.println("Estoy en el indice ["+ cont +"]: " + vector[cont]);
        }
    }
}
