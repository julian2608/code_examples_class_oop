package clase_POO.inventory_library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Option option = null;
        Scanner scan = new Scanner(System.in);
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Quijote de la mancha", 1996, "Pedro infante", "1234567891234"));
        libros.add(new Libro("El principito", 1998, "Petro", "1234567891235"));
        libros.add(new Libro("La pasión de Cristo", 2000, "Raul gasca", "1234567899876"));
        libros.add(new Libro("Piense y hagase rico", 2005, "Robert el yosaki", "3216567899847"));

        List<Revista> revistas = new ArrayList<>();

        int anioPublicacion;
        String autor;
        String numeroIsbn;
        String titulo;
        int numeroEdicion;

        while (option != Option.SALIR) {
            System.out.print(
                    "\n \nBienvenido al sistema bibliotecapp.\n \n"
                            + "Por favor seleccione una opción:\n"
                            + "1. Crear un libro.\n"
                            + "2. Crear una revista.\n"
                            + "3. Ver todas las libros.\n"
                            + "4. Ver todos los revistas.\n"
                            + "5. Buscar libro.\n"
                            + "6. Buscar revista.\n"
                            + "7. Salir\n \n");

            System.out.print("Digita una opción: ");

            option = Option.fromInt(scan.nextInt());
            scan.nextLine();

            switch (option) {
                case CREAR_LIBRO -> {
                    Libro libro = null;

                    while (Objects.isNull(libro)) {
                        System.out.print("Digita el titulo del libro: ");
                        titulo = scan.nextLine();

                        System.out.print("Digita el año de publicación del libro: ");
                        anioPublicacion = scan.nextInt();
                        scan.nextLine();

                        System.out.print("Digita el autor del libro: ");
                        autor = scan.nextLine();

                        System.out.print("Digita el numero ISBN del libro: ");
                        numeroIsbn = scan.nextLine();

                        libro = GestionLibro.crear(titulo, anioPublicacion, autor, numeroIsbn);

                        libros.add(libro);
                    };

                }
                case CREAR_REVISTA -> {
                }
                case VER_TODOS_LIBROS -> {
                    GestionLibro.mostrarTodos(libros);
                }
                case VER_TODOS_REVISTAS -> {

                }
                case BUSCAR_LIBROS -> {
                    int tipoBusqueda = 0;

                    System.out.print("\n \nDigite que tipo de busqueda desea realizar:"
                            + "\n 1. Exacta por numero ISBN."
                            + "\n 2. Por coincidencia de titulo."
                            + "\n \nDigite tipo de busqueda: ");
                            
                    tipoBusqueda = scan.nextInt();
                    scan.nextLine();

                    switch (tipoBusqueda) {
                        case 1 -> {
                            System.out.print("\n \nDigita el numero ISBN del libro: ");

                            Libro resultadoBusqueda = GestionLibro.buscarUnoPorIsbn(scan.nextLine(), libros);

                            if (Objects.nonNull(resultadoBusqueda)) {
                                GestionLibro.mostrarTodos(resultadoBusqueda);
                            } else {
                                System.out.println("\n \nLibro no encontrado.");
                            }
                        }
                        case 2 -> {
                            System.out.print("\n \nDigita el titulo o parte del titulo: ");

                            List<Libro> resultadoBusqueda = GestionLibro.buscarPorTitulo(scan.nextLine(), libros);

                            if (resultadoBusqueda.size() > 0) {
                                GestionLibro.mostrarTodos(resultadoBusqueda);
                            } else {
                                System.out.println("\n \nError: Sin coincidencias.");
                            }
                        }
                        default -> {
                        }
                    }

                }
                case BUSCAR_REVISTAS -> {

                }
                default -> {
                }

            }

        }
    }
}
