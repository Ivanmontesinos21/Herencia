package Prueba;

public class Work {
    public static void main(String[] args) {
        Persona[] personas=new Persona[3];
        personas[0] = new Persona("Luis","Garcia");
        personas[1] = new Alumno("Carlos","Martinez","123456789");
        personas[2] = new Profesor("Joaquin","Alonso","123456789");

        for (Persona p:personas)
            if (p instanceof Profesor)
                System.out.println(((Profesor)personas[2]).getSalario());


    }

}
