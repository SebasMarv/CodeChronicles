/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_operadores;

/**
 *
 * @author USER
 */
public class Ejercicio {
    public static void main(String[] args) {
        
        int num1, num2, auxiliar;

        num1 = 35;
        num2 = 20;

        System.out.println("Antes|" + "num1: " + num1 + " - um2: " + num2);
        
        auxiliar = num1;
        num1 = num2;
        num2 = auxiliar;
        
        System.out.println("Despues|" + "num1: " + num1 + " - num2: " + num2);
    }   
}
