package ejercicio_cuenta_bancaria;

public class Producto {
    private String code;
    private String name;
    private double price;
    private int stock;

    public void buy (int cantidad) {
        this.stock -= cantidad;
    }

    public void replenish (int cantidad) {
        this.stock += cantidad;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
