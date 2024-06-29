package clase_POO.inventory_library;

public enum Option {
    CREAR_LIBRO(1),
    CREAR_REVISTA(2),
    VER_TODOS_LIBROS(3),
    VER_TODOS_REVISTAS(4),
    BUSCAR_LIBROS(5),
    BUSCAR_REVISTAS(6),
    SALIR(7)
    ;

    private int option;

    public int getOption(){
        return option;
    }

    private Option (int option) {
        this.option = option;
    }

    public static Option fromInt(int valor) {
        for (Option option : Option.values()) {
            if (option.option == valor) {
                return option;
            }
        }
        throw new IllegalArgumentException("Valor no válido: " + valor);
    }
}
