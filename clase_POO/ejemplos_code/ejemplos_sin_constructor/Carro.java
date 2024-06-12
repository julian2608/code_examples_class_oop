package clase_POO.ejemplos_code.ejemplos_sin_constructor;

public class Carro {
    String marca;
    String color;
    int modelo;
    int cilindraje;

    public void encender() {
        System.out.println("Motor encendido");
    }

    public void apagar() {
        System.out.println("Motor apagado");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
    }
}
