package clase_POO.herencia;

import java.util.Scanner;

public class CrearObjetosConHerencia {

    public static void main(String[] args) {
        int[] notas = {1, 2, 3, 4, 5};

        Estudiante estudiante = new Estudiante("Camilo temprano", 18, 1234567, "Ing En Dormir", 5, notas);
    
        estudiante.mostrarInfo();        
    }
    
}
