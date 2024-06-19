package ejercicio_cuenta_bancaria;

public class Main {
    public static void main(String[] args) {
        Producto ketchup = new Producto ();
        ketchup.setName("Salsa de tomate");
        ketchup.setCode("123456");
        ketchup.setPrice(4000);

        ketchup.replenish(40);

        ketchup.buy(2);

        System.out.println("La cantidad que queda en stock de ketchup es: " + ketchup.getStock() );

    }
}
