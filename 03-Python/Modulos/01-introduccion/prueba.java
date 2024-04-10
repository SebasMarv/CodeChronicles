package hola;

public class prueba {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 4, 6, 1, 3};
        // Recorremos el array tantas veces como elementos tenga
        for (int i = 0; i < numeros.length - 1; i++) {
            // Bandera para indicar si se ha realizado algún cambio
            boolean cambio = false;
            // Recorremos el array comparando elementos adyacentes
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    cambio = true;
                }
            }
            // Si no se ha realizado ningún cambio en la última iteración, el array ya está ordenado
            if (!cambio) {
                break;
            }
        }
        // Imprimimos el array ordenado
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    } // Aquí se agrega la llave de cierre }
}