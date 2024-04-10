package four_estructurasControl;

public class Condicionales {
    public static void main(String[] args) {
        
        int num1 = 15;
        int num2 = 10;

        // if (num2>num1) {
        //     System.out.println("El num2 es mayor a num1");
        // } else {
        //     System.out.println("El num1 es mayor a num2");
        // }

        // Ahora en operador ternario
        // valorAsignar = (condición) ? valorSiVerdadero : valorSiFalso;
        
        String resultado = (num2>num1) ? "El num2 es mayor a num1" : "El num1 es mayor a num2";
        System.out.println(resultado);
        
    }
}
