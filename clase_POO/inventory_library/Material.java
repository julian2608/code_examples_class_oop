package clase_POO.inventory_library;

public class Material {
    private String titulo;
    private int anioPublicacion;

    public Material(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo(){
        System.out.print(String.format("Los datos de la publicación son los siguiente, Titulo: %s, Año publicación: %s", this.titulo, this.anioPublicacion));
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
}
