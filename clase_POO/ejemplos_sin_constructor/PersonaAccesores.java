package clase_POO.ejemplos_sin_constructor;

public class PersonaAccesores {
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private int numeroIdentificacion;
    private int estatura;
    private int edad;
    private int celular;
    private String direccion;
    private String ciudad;

    public String nombreCompleto() {
        return nombres + apellidos;
    }

    public void presentacion() {
        System.out.println(String.format(
                "El usuario %s %s con %s numero %s con estatura %s y edad %s, residente de la ciudad de %s en la dirección %s, puede ser contactado al %s",
                nombres, apellidos, tipoDocumento, numeroIdentificacion, estatura, edad, ciudad, direccion, celular));
    }


    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getEstatura() {
        return this.estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return this.celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}
