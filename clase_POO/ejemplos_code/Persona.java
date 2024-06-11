package clase_POO.ejemplos_code;

public class Persona {
    String nombres;
    String apellidos;
    String tipoDocumento;
    int numeroIdentificacion;
    int estatura;
    int edad;
    int celular;
    String direccion;
    String ciudad;

    public Persona(String nombres, String apellidos, String tipoDocumento, int numeroIdentificacion, int estatura,
            int edad, int celular, String direccion, String ciudad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estatura = estatura;
        this.edad = edad;
        this.celular = celular;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String nombreCompleto() {
        return nombres + apellidos;
    }

    public void presentacion() {
        System.out.println(String.format(
                "El usuario %s %s con %s numero %s con estatura %s y edad %s, residente de la ciudad de %s en la dirección %s, puede ser contactado al %s",
                nombres, apellidos, tipoDocumento, numeroIdentificacion, estatura, edad, ciudad, direccion, celular));
    }

}
