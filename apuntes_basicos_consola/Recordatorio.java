/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apuntes_basicos_consola;

import java.util.Scanner;

/**
 *
 * @author valen
 */
public class Recordatorio {

    public static void main(String[] args) {

        /**** VARIABLES ****/

        // Asi se declara una variable de tipo cadena
        // Nota: La "s" de String debe ser mayuscula
        // En java podemos asignar un valor de una vez en la declaración de la variable,
        // este se le asigno un valor vacio
        String cadena = "";

        // Asi se declara una variable de tipo entero
        // La "i" de int debe ser minuscula
        int entero;

        // Asi se declara una variable de tipo flotante
        // La "f" de float debe ser minuscula
        float flotante;

        // Asi se declara una variable de tipo doble
        // La "d" de double debe ser minuscula
        double doble;

        // Asi se declara una variable de tipo logico o booleano
        // La "b" de boolean debe ser minuscula
        // EL tipo booleano solo puede ser true o false
        boolean booleano;

        /**** CONSTANTES ****/
        // Solo basta con agregar la palabra reserveda final al principio
        // Se declaran igual que las variables
        // Se les asigna el valor en la misma declaración

        final int mayoriaDeEdad = 18;

        final String tipoMedida = "KM/H";

        final double numeroPi = 3.1416;

        // Bloque condicional simple if
        // Un solo igual es para asignar valor a la variable
        // Doble igual es para comparar
        if (cadena == "Julian") {

            // Aqui iria nuestro codigo si la expresión logica es verdadera
        } else {
            // Aqui escribimos nuestro codigo si la expresion logica es falsa
        }

        // Bloque condicional compuesto if
        // Un solo igual es para asignar valor a la variable
        // Doble igual es para comparar
        if (cadena == "Julian") {
            // Aqui iria nuestro codigo si la expresión logica de Julian es verdadera
        } else if (cadena == "Miguel") {
            // Aqui escribimos nuestro codigo si la expresion logica de Miguel es verdadera
        } else if (cadena == "Juan") {
            // Aqui escribimos nuestro codigo si la expresion logica de Juan es verdadera
        } else {
            // Aqui irian el resto de casos que no cumplan con ninguna de las expresiones
            // logicas
        }

        // La estructura switch es un homólogo más legible y ordenado de los if compuestos que solo requieren una comparación por igualdad
        // Tiene una variable de la que dependen los casos
        // Puede tener cuantos casos sean necesarios
        // No soporta expresiones lógicas
        // Cada caso se compara con la variable del switch, si es igual (==) se ejecuta el código del caso
        // Hay un caso default que sería equivalente al else de un if
        switch (cadena) {
            case "Julian": {
                // Aqui iria nuestro codigo si la variable cadena es igual a Julian
            }
            case "Miguel": {
                // Aqui iria nuestro codigo si la variable cadena es igual a Miguel
            }
            case "Juan": {
                // Aqui iria nuestro codigo si la variable cadena es igual a Juan
            }
            default: {
                // Aqui iria nuestro codigo si la variable cadena no es igual a ninguno de los
                // casos anteriores
            }
        }

        // int contador=0 declarar el contador e iniciarlo en 0
        // contador <= 100 le indica al bucle cuando parar, en este caso para cuando el
        // contador llegue a 100
        // contador++ incrementa la variable contador de 1 en 1, por ejemplo si quisiera
        // hacerlo de 2 en 2 seria contador+=2
        for (int contador = 0; contador <= 100; contador++) {
            // Aqui iria el codigo que queremos que se repita
        }

        // Para capturar lo que el usuario escriba creamos un Scanner
        // Importante poner entre los parentesis System.in
        /*
         * Importante cuando creemos el Scanner importar la dependencia, haciendo click
         * en el bombillo de ayuda y click en add
         * import java.util.Scanner
         */
        Scanner leer = new Scanner(System.in);

        // Para leer lo que escribio el usuario lo hacemos asi
        // Si es un String usamos .nextLine si es un int nextInt, si es un double
        // nextDouble
        // Estos valor de next se guardan en variables
        cadena = leer.nextLine();
        doble = leer.nextDouble();
        entero = leer.nextInt();
        flotante = leer.nextFloat();

        // Si quiero mostrar un mensaje o un resultado en pantalla lo hago asi:
        // Puedo impirmir variable ó mensaje literales entre comillas ó ambos
        // concatenandolos con un +
        System.out.println("Digite el numero1: ");
        System.out.println(cadena);
        System.out.println("El valor de la variable cadena es: " + cadena);

    }
}
