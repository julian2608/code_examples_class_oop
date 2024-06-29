package clase_POO.inventory_library;

public class Libro extends Material {

    private String autor;
    private String numeroIsbn;

    public Libro(String titulo, int anioPublicacion,String autor, String numeroIsbn) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.numeroIsbn = numeroIsbn;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(String.format(", es un libro y sus datos adicionales son los siguientes, Autor: %s, Numero isbn: %s.", this.autor, this.numeroIsbn));
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumeroIsbn() {
        return this.numeroIsbn;
    }

    public void setNumeroIsbn(String numeroIsbn) {
        this.numeroIsbn = numeroIsbn;
    }

    
}
