package four_estructurasControl;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // While es la mas utilizada (ejecuta el bloque de codigo "mientras" que se cumpla la condicion)
        // Controlado por contador o centinela
        // Centinela => Proceso que puede ser pausado hasta que existe dentro del while una vairacion que cumpla la condicion

        int contador = 0, desicion;

        // while (contador <= 10) {
        //     System.out.println("Estoy en la vuelta: "+contador);
        //     // contador++;
        //     contador = contador + 1;
        // }

        Scanner input = new Scanner(System.in);
        System.out.println("Desea ejecutar el bucle o no: [1-Si | 2-No]");
        desicion = input.nextInt();
        input.close();

        if (desicion == 1) {
            while (contador <=20) {
                System.out.println("Vuelta: "+contador);
                contador++;
            }
        } else {
            System.out.println("No quizo el bucle");
        }
    }
}
