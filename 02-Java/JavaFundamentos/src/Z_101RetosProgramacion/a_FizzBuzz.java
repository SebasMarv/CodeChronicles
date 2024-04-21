package Z_101RetosProgramacion;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class a_FizzBuzz {
    public static void main(String[] args) {
        int cont = 1;
        
        // Podemos detectar el resto de una division con "%" para saber si es 
        // par o impar.
        while (cont<=100) {    
//            System.out.println(cont);
            if (cont%3 == 0 && cont%5 ==0) {
                System.out.println("fizzbuzz");
            } else if (cont%5 == 0) {
                System.out.println("buzz");
            } else if (cont%3 == 0) {
                System.out.println("fizz");
            } 
            cont++;
        }
    }
}
