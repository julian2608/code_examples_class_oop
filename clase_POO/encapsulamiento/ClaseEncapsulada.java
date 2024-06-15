package clase_POO.encapsulamiento;

public class ClaseEncapsulada {

    private String nombres;
    protected String apellidos;
    public int edad;
    int estatura;

    public String nombreCompleto() {
        return nombres + apellidos;
    }

}
