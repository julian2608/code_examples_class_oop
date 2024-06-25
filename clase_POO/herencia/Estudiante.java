package clase_POO.herencia;

public class Estudiante extends Persona {
    private String carrera;
    private int semestre;
    private int[] notas;

    public Estudiante(String nombre, int edad, int cedula, String carrera, int semestre, int[] notas) {
        super(nombre, edad, cedula);
        this.carrera = carrera;
        this.semestre = semestre;
        this.notas = notas;
    }

    @Override
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println(String.format(", carrera: %s, semestre: %s, notas: %s.", this.carrera, this.semestre, this.notas));
    }

    public void calcularPromedio (){
        int promedio = 0;
        for (int i = 0; i <= notas.length; i++){
            promedio += notas[i];
        }

        promedio = promedio / notas.length;

        System.out.println(String.format("El estudiante %s tiene un promedio de %s", getNombre(), promedio));
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int[] getNotas() {
        return this.notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }


}