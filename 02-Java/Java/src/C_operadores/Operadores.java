/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_operadores;

/**
 *
 * @author USER
 */
public class Operadores {
    public static void main(String[] args) {

        // int num1, num2, resultado;
        // num1 = 4;
        // num2 = 2;
        // resultado = num1 * num2;
        // System.out.println("El resultado de la multiplicacion es de: "+resultado);

        int variableX = 50, variableY = 10;
        int resultado;

        // Operadores Aritmeticos - Básicos

        resultado = variableX + variableY;
        System.out.println(resultado);

        resultado = variableX - variableY;
        System.out.println(resultado);

        resultado = variableX * variableY;
        System.out.println(resultado);

        resultado = variableX / variableY;
        System.out.println(resultado);

        // Operadores Aritmeticos - Intermedios
        // -- -> Decremento
        // ++ -> Incremento

        // variableX = variableX + 1;
        // variableX++;
        variableX += 1;
        System.out.println(variableX);

        // variableX = variableX - 1;
        // variableX--;
        variableX -= 1;
        System.out.println(variableX);

        variableX *= 2;
        System.out.println(variableX);

        variableX /= 2;
        System.out.println(variableX);

        System.out.println(
                "Status de variables: \nvariableX: " + variableX + "\nvariableY: " + variableY + "\nresultado: "
                        + resultado);

        // Cast

        float variableZ = 5.5f;

        // Consiste de convertir de forma espontanea la conversion del tipo de datos
        // de una variable a otra, en este caso de float a int
        resultado = variableX + (int) variableZ;
        System.out.println(resultado + " " + (int) variableZ);

        // Operadores relacionales
        int variablel = 300, variable2 = 200;
        boolean resultado2;

        resultado2 = variablel > variable2;
        System.out.println(resultado2);
        resultado2 = variablel < variable2;
        System.out.println(resultado2);
        resultado2 = variablel >= variable2;
        System.out.println(resultado2);
        resultado2 = variablel <= variable2;
        System.out.println(resultado2);
        resultado2 = variablel == variable2;
        System.out.println(resultado2);
        resultado2 = variablel != variable2;
        System.out.println(resultado2);

        // Operador.es lógicos
        // and (y), or (o) y not (no)
        boolean resultad3;
        resultad3 = 5 >= 5 && true && 10 > 9;
        System.out.println(resultad3);
        resultad3 = false || false || false || true;
        System.out.println(resultad3);
        resultad3 = (5 >= (2 * 3) || true) && (true && 10 > 5);
        System.out.println(resultad3);
        System.out.println(!false);

        // Operador ternario
        // IFTTT
        // expresionl ? expresion2 : expresion3
        String mensaje = 10 > 90 ? "Es mayor" : "Es menor";
        System.out.println(mensaje);

        String mensajee = mensaje.concat(" que el otro");
    }
}
