/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_estructurasControl;

/**
 *
 * @author USER
 */
public class Switch {

    public static void main(String[] args) {
        int dia = 7;
        String nombreDia;

        switch (dia) {
            case 1: nombreDia = "Lunes";
                break;
            case 2: nombreDia = "Martes";
                break;
            case 3: nombreDia = "Miercoles";
                break;
            case 4: nombreDia = "Jueves";
                break;
            case 5: nombreDia = "Viernes";
                break;
            case 6: nombreDia = "Sabado";
                break;
            case 7: nombreDia = "Domingo";
                break;
            default: nombreDia = "Numero de dia invalido";
                break;
        }

        System.out.println("El dia de la semana seleccionado es: "+nombreDia);
    }
}
