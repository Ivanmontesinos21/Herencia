package Prueba;

public class Profesor extends Persona {
    private String DNI;

    public Profesor(String nombre, String apellidos, String DNI) {
        super(nombre, apellidos);
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Profesor [" + "nombre" + nombre + "," + "apellidos:" + apellidos + "," + "DNI" +
                DNI;
    }
    public int getSalario(){
        return 1000;
    }
}
