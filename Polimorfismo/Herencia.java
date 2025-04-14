package Polimorfismo;


public class Herencia {

    public static void main(String[] args) {
        // HERENCIA
        Empleado empleado = new Empleado();
        Consultor consultor = new Consultor();

        empleado.getClass();
        consultor.getDomicilio();

        // POLIMORFISMO
        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();
        
        Persona persona = new Persona();
        Consultor consultor2 = new Consultor();

        persona = consultor2 ;

    }
}