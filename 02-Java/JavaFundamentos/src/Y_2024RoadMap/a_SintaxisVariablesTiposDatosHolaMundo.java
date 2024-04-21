package Y_2024RoadMap;

/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado. ☑️
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...). ☑️
 * - Crea una variable (y una constante si el lenguaje lo soporta). ☑️
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...). ☑️
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!" ☑️ 
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

public class a_SintaxisVariablesTiposDatosHolaMundo {
    public static void main(String[] args) {
        //https://www.java.com/es/
        
        /*
        https://www.java.com/es/
        */
        
        // Variable
        int variable = 4;
        
        // Constante
        final int constante = 3;
        
        // Declaración de variables primitivas del lenguaje JAVA
        int entero = 1;
        double real = 1.0;
        String palabra = "palabra";
        boolean desicion = false;
        char caracter = 'a';
        byte valorbyte = 127;
        short valorShort = 12345;
        long valorLong = 87383473748374L;
        float valorFloat = 3.123F;
        
        // Imprimir !Hola (JAVA)¡
        System.out.println("!Hola Java¡");
        System.out.println(variable+constante+entero+real+palabra+desicion+caracter+valorbyte+valorShort+valorLong+valorFloat);
    }
}
