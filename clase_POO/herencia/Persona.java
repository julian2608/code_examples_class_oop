package clase_POO.herencia;

public class Persona {
    private String nombre;
    private int edad;
    private int cedula;

    public Persona (String nombre,int edad,int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public void mostrarInfo () {
        System.out.print(String.format("Los datos basicos de la persona son, nombre: %s, edad: %s, cedula: %s", this.nombre, this.edad, this.cedula));
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

}
