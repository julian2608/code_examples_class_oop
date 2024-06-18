package clase_POO;

public class SobrecargaDeMetodos {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga del método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga del método para sumar dos números de tipo double
    public double sumar(double a, double b) {
        return a + b;
    }
}