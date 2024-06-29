package clase_POO.inventory_library;

public class Revista extends Material{

    private int numeroEdicion;

    public Revista(String titulo, int anioPublicacion, int numeroEdicion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(String.format(", es una revista y sus datos adicionales son los siguientes, Número de edicion: %s.", this.numeroEdicion));
    }

    public int getNumeroEdicion() {
        return this.numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

}
