/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosEstaticos;
import java.util.Arrays;
/**
 *
 * @author USER
 */
public class Implementacion {
    public static void main(String[] args) {
        int[] Array = new int[5];
        Array[0] = 1;
        Array[1] = 2;
        Array[2] = 3;
        Array[3] = 4;
        Array[4] = 5;
        
        System.out.println(Arrays.toString(Array));
        OperacionesArrarys.insertarElemento(Array, 10, 2);
        System.out.println(Arrays.toString(Array));
        OperacionesArrarys.actualizarElemento(Array, 20, 3);
        System.out.println(Arrays.toString(Array));
        OperacionesArrarys.borrarElemento(Array, 1);
        System.out.println(Arrays.toString(Array));
    }
}
