package clase_POO.ejemplos_code.ejemplos_sin_constructor;

public class MetodoConObjetoEnParametro {

    public static void main(String[] args) {
        Carro carroMazda = new Carro();
        carroMazda.color = "Rojo";
        carroMazda.modelo = 2020;
        carroMazda.marca = "Mazda";

        validarGarantia(carroMazda);
    }

    public static void validarGarantia(Carro carro) {

        switch (carro.marca) {
            case "Kia" -> {
                System.out.println("La garantia son 5 años");
            }
            case "Mazda" -> {
                System.out.println("La garantia son 2 años");

            }
            case "Ford" -> {
                System.out.println("La garantiason 10 años");
            }
        }

    }
}
