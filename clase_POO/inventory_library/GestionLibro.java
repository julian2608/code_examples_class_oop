package clase_POO.inventory_library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestionLibro {

    public static Libro crear(String titulo, int anioPublicacion, String autor, String numeroIsbn) {

        if (numeroIsbn.length() != 13) {
            System.out.println("El numero ISBN debe tener 13 digitos.");
            return null;
        }

        if (anioPublicacion > 2024) {
            System.out.println("El año de publicación no puede ser mayor al año actual.");
            return null;
        }

        return new Libro(titulo, anioPublicacion, autor, numeroIsbn);
    }

    public static void mostrarTodos(List<Libro> libros) {
        mostrarCabeceraTabla();

        for (Libro libro : libros) {
            mostrar(libro);
        }
    }

    public static void mostrarTodos(Libro libro) {
        mostrarCabeceraTabla();

        mostrar(libro);
    } 

    private static void mostrarCabeceraTabla() {
        System.out.println("\n \n");
        System.out.println(
                "|-----------------------------------------------------------------------------------------------------|");
        System.out.printf("%-32s %-20s %-31s %-16s|\n", "|Titulo", "|Año de Publicación", "|Autor", "|Número ISBN");
        System.out.println(
                "|_____________________________________________________________________________________________________|");
        System.out.println(
                "|-----------------------------------------------------------------------------------------------------|");
    }

    private static void mostrar(Libro libro) {
            System.out.printf("|%-31s |%-19d |%-30s |%-15s|\n", libro.getTitulo(), libro.getAnioPublicacion(),libro.getAutor(), libro.getNumeroIsbn());
            System.out.println("|_____________________________________________________________________________________________________|");
    }

    public static List<Libro> buscarPorTitulo(String titulo, List<Libro> lista) {
        List<Libro> result = new ArrayList<>();

        for (Libro libro : lista) {
            if (libro.getTitulo().toUpperCase().contains(titulo.toUpperCase())) {
                result.add(libro);
            }
        }

        return result;
    }

    public static Libro buscarUnoPorIsbn(String numeroIsbn, List<Libro> lista) {
        for (Libro libro : lista) {
            if (libro.getNumeroIsbn().equals(numeroIsbn)) {
                return libro;
            }
        }
        return null;
    }
}
