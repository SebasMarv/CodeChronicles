/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosEstaticos;

/**
 *
 * @author USER
 */
public class OperacionesArrarys {
    // Insertar elemento
    public static void insertarElemento(int[] array, int element, int position) {
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
    }
    // Actualizar elemento
    public static void actualizarElemento(int[] array, int element, int position) {
        array[position] = element;
    }
    // Eliminar elemento
    public static void borrarElemento(int[] array, int position) {
        for (int i = position; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }
}

