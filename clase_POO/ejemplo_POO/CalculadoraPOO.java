package clase_POO.ejemplo_POO;

import java.util.Scanner;

public class CalculadoraPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Calculadora Básica");
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            System.out.println("Ingrese el primer número:");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número:");
            double num2 = scanner.nextDouble();

            Operacion operacion = null;

            switch (opcion) {
                case 1:
                    operacion = new Suma(num1, num2);
                    break;
                case 2:
                    operacion = new Resta(num1, num2);
                    break;
                case 3:
                    operacion = new Multiplicacion(num1, num2);
                    break;
                case 4:
                    operacion = new Division(num1, num2);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }

            double resultado = operacion.calcular();
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}