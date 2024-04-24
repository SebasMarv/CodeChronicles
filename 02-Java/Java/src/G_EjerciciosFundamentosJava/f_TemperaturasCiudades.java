/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_EjerciciosFundamentosJava;

import java.util.Scanner;

/*

 */
public class f_TemperaturasCiudades {
    public static void main(String[] args) {
        
        // Creación de vectores
        String ciudades[] = new String[5]; 
        Double tempMin[] = new Double[5]; 
        Double tempMax[] = new Double[5]; 
        
        Scanner input = new Scanner(System.in);
        Scanner inputDouble = new Scanner(System.in);
        
        // Carga de datos a vectores
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad: "+i);
            ciudades[i] = input.next();
            System.out.println("Ingrese la minima de la ciudad: "+i);
            tempMin[i] = inputDouble.nextDouble();
            System.out.println("Ingrese la maxima de la ciudad: "+i);
            tempMax[i] = inputDouble.nextDouble();
        }
        
        Double minima = 9999999.00;
        int posMin = -1;
        
        // Determinar la minima
        for (int i = 0; i < ciudades.length; i++) {
            if (tempMin[i] < minima) {
                minima = tempMin[i];
                posMin = i;
            }
        }
        
        Double maxima = -9999999.00;
        int posMax = -1;
        
        // Determinar la minima
        for (int i = 0; i < ciudades.length; i++) {
            if (tempMax[i] > maxima) {
                maxima = tempMax[i];
                posMax = i;
            }
        }
        System.out.println("La temperatura minima fue de: "+minima+" en la ciudad: "+ciudades[posMin]);
        System.out.println("La temperatura maxima fue de: "+maxima+" en la ciudad: "+ciudades[posMax]);

        inputDouble.close();
        input.close();
    }
}
