package clase_POO.ejemplos_code.ejemplos_sin_constructor;

public class ValorPorReferencia {
    public static void main(String[] args) {
        Carro carroOriginal;
        carroOriginal = new Carro();
          
        carroOriginal.color = "Rojo escarlata";
        carroOriginal.cilindraje = 1500;
        
        Carro carroCopia = carroOriginal;
        carroCopia.color = "Rojo triple AAA";
        
        System.out.println(carroOriginal.color);

    }
}
