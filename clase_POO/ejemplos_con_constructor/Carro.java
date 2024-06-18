package clase_POO.ejemplos_con_constructor;

public class Carro {

    private String marca;
    private String color;
    private int modelo;
    private int cilindraje;

    // Constructor sin parametros ó vacio
    public Carro() {
    }

    // Constructor con parametros
    public Carro(String marca, String color, int modelo, int cilindraje) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    // Constructor sobrecargado
    public Carro(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    // Métodos de comportamiento
    public void encender() {
        System.out.println("Motor encendido");
    }

    public void apagar() {
        System.out.println("Motor apagado");
    }

    public void mostrarInfo() {
        System.out.println(
                "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Cilindraje: " + cilindraje);
    }

    // Métodos accesores getters y setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return this.cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

}