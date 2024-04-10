package four_estructurasControl;

public class CondicionesAnidadas {
    public static void main(String[] args) {
        
        String op1, op2, op3, exito;
        op1 = "no";
        op2 = "si";
        op3 = "si";
        exito = "No hay que realizar nada mas :)";

        System.out.println("Enciendo el velador?");

        if (op1=="si") {
            System.out.println(op1);
            System.out.println(exito);
        } else {
            System.out.println("Esta enchufado?");
            if (op2=="si") {
                System.out.println(op2);
                System.out.println("Esta quemado el foco");
                if (op3=="si") {
                    System.out.println(op3);
                    System.out.println("Cambiar el foco");
                    System.out.println(exito);
                } else {
                    System.out.println("Llevar a reparar");
                    System.out.println(exito);
                }
            } else {
                System.out.println("Enchufar velador");
                System.out.println(exito);
            }
        }
    }
}
