package GettersYSetters;
public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Alumno alumno1 = new Alumno(1, "Agustin", "Altamirano");

        System.out.println("id: " + alumno1.getId());
        System.out.println("name: " + alumno1.getName());
        System.out.println("Last name: " + alumno1.getLastName());

        alumno.setId(34);
        alumno.setName("jorge");
        alumno.setLastName("ludueña");

        System.out.println("-------------------------------");
        alumno.showAlumno();
    }
}