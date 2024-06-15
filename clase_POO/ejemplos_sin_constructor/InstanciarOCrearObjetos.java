package clase_POO.ejemplos_sin_constructor;

public class InstanciarOCrearObjetos {

    public static void main(String[] args) {

        // Ejemplo creacion de objeto Carro
        Carro carroMazda = new Carro();

        carroMazda.color="Rojo escarlata";
        carroMazda.cilindraje=1500;
        carroMazda.marca="Mazda";
        carroMazda.modelo=2020;

        carroMazda.encender();

        carroMazda.mostrarInfo();


        // Ejemplo creacion de objeto Persona
        Persona persona = new Persona();

        persona.presentacion();

        Persona persona2 = new Persona();
        persona2.nombres = "Julian Arley";
        persona2.apellidos = "Gutierrez";
        persona2.tipoDocumento = "CC";
        persona2.numeroIdentificacion = 1126478796;
        persona2.estatura = 172;
        persona2.edad = 24;
        persona2.celular = 315478987;
        persona2.direccion = "Calle del venado con carrera 45";
        persona2.ciudad = "Ibague";

        persona.presentacion();
        
    }

}
