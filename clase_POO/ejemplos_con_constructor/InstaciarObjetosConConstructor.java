package clase_POO.ejemplos_con_constructor;

public class InstaciarObjetosConConstructor {
    // Creado con el constructor por defecto, o el definido como vacio
    Carro carroMazda = new Carro();

    // Creado con constructor con todos los parametros
    Carro carroKia = new Carro("KIA", "Negro", 2020, 1500);

    // Creado con constructor sobrecargado solamente con marca y color
    Carro carroFord = new Carro("Ford", "Negro");

}
