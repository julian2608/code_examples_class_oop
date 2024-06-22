package clase_POO.herencia;

public class Profesor extends Persona {
    private String asignatura;
    private int horasClase;
    private int pagoPorHora;
    private String salon;

    public Profesor(String nombre, int edad, int cedula, String asignatura, int horasClase, int pagoPorHora, String salon) {
        super(nombre, edad, cedula);
        this.asignatura = asignatura;
        this.horasClase = horasClase;
        this.pagoPorHora = pagoPorHora;
        this.salon = salon;
    }
    

    public void calcularSalario (){
        int salario = this.horasClase * pagoPorHora;
        System.out.println(String.format("El profesor %s tiene un salario de %s", getNombre(), salario));
    }


    public String getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getHorasClase() {
        return this.horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getPagoPorHora() {
        return this.pagoPorHora;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public String getSalon() {
        return this.salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }





}
