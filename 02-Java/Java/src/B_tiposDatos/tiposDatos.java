/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_tiposDatos;

/**
 *
 * @author USER
 */
public class tiposDatos {
    public static void main(String[] args) {

        // Constantes
        final double igv = 0.18;

        // Variables
        // Enteros
        byte diasMes = 31; // Aproximadamente
        short diasLustro = (12 * 31) * 5;
        int velocidadLuz = 299792458;
        long añoLuz = velocidadLuz * 365;

        // Decimales
        float pi = 3.1415926535f;
        double e = 2.718281828459045235360;

        System.out.println("-----------------Tipos de Datos en Java-----------------");
        System.out.println();

        // Caracteres
        char letraA = 'A';

        // Booleanos
        boolean verdadero = true;
        boolean falso = false;

        // Imprimir Enteros
        System.out.println("byte: " + diasMes);
        System.out.println("short: " + diasLustro);
        System.out.println("int: " + velocidadLuz);
        System.out.println("long: " + añoLuz);

        // Imprimir Decimales
        System.out.println("float: " + pi);
        System.out.println("double: " + e);

        // Imprimir Caracteres
        System.out.println("char: " + letraA);

        // Imprimir Booleanos
        System.out.println("boolean: " + verdadero);
        System.out.println("boolean: " + falso);

        // Imprimir Constantes
        System.out.println("Constante: " + igv);

        System.out.println();
        // Palabras reservadas de Java
        System.out.println("-----------------Palabras reservadas de Java-----------------");
        System.out.println();
        String palabrasReservadas = "abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while";
        String[] palabrasArray = palabrasReservadas.split(", ");

        int columnas = 5;
        int filas = (int) Math.ceil((double) palabrasArray.length / columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i + j * filas;
                if (index < palabrasArray.length) {
                    System.out.printf("%-12s", palabrasArray[index]);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Añadir que tambien se incluyen las palabras true, false y null.");
        System.out.println();
    }
}
