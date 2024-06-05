import java.util.Scanner;

public class CalculadoraEstructurada {
    
    // Función para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Función para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Función para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Función para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }

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

            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
