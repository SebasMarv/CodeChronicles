package G_EjerciciosFundamentosJava;

import java.util.Scanner;

/*
Una pequeña despensa desea calcular los sueldos de sus empleados.
Los puestos de los mismos pueden tener 3 categorías: 
* [1]repositor,
* [2]cajero 
* [3]supervisor.

a) Los repositores cobran $ 15.890 + un bono de 10%.
b) Los cajeros cobran $ 25.630,89 fijos.
c) Los supervisores cobran $ 35.560,20 en bruto a1 cual se les descuenta un 11% do jubilación.
Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, 
calcule y muestre en pantalla el correspondiente sueldo.

Utilizar: Condicionales
 */

public class a_SueldoEmpleados {
    public static void main(String[] args) {
        
        // Uso de Switch
        /*
        int cat;
        double sueldo;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la categoria del empleado:\n*[1]repositor\n*[2]cajero\n*[3]supervisor");
        System.out.println("----------------------------------");
        cat = input.nextInt();
        
        switch (cat) {
            case 1:
                sueldo = 15890 + (15890*0.10);
                System.out.println("El Repositor obtiene como sueldo: "+sueldo);
                break;
            case 2:
                sueldo = 25630.89;
                System.out.println("El Cajero obtiene como sueldo: "+sueldo);
                break;
            case 3:
                sueldo = 35560.20 - (35560.20*0.11);
                System.out.println("El Supervisor obtiene como sueldo: "+sueldo);
                break;
            default:
                System.out.println("Categoria incorrecta, favor de volver a intentar!!!");
        }
        input.close();
        */
        
        
        /* Una pequeña despensa desea calcular los sueldos de sus empleados.
        Los puestos de los mismos pueden tener 3 categorías: 
        * [1]repositor,
        * [2]cajero 
        * [3]supervisor.

        a) Los repositores cobran $ 15.890 + un bono de 10%.
        b) Los cajeros cobran $ 25.630,89 fijos.
        c) Los supervisores cobran $ 35.560,20 en bruto a1 cual se les descuenta un 11% do jubilación.
        Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, 
        calcule y muestre en pantalla el correspondiente sueldo.

        Utilizar: Condicionales */
        
        // Uso de if-else
        int cat;
        double sueldo = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la categoria deseada:\n*[1]repositor\n*[2]cajero\n*[3]supervisor");
        cat = input.nextInt();
        input.close();
        
        if (cat==1) {
            sueldo = 15890 + (15890*0.10);
        } else if (cat==2) {
            sueldo = 25630.89;
        } else if (cat==3) {
            sueldo = 35560.20 - (35560.20*0.11);
        } else {
            System.out.println("Ingrese una categoria correcta!!");
        }
        
        if (cat==1 || cat==2 || cat==3) {
            System.out.println("------------------------------");
            System.out.println("La categoria es: "+cat);
            System.out.println("El sueldo de la persona es: "+sueldo);
            System.out.println("------------------------------");
        }
    }
}
