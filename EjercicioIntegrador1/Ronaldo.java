package EjercicioIntegrador1;

public class Ronaldo extends Jugadores implements InterfaceDelantero{
    
    // Constructor
    public Ronaldo()
    {

    }
    
    // Clases abstractas
    @Override
    protected void reflejos() {
        System.out.println("reflejos: 90");
    }

    @Override
    protected void marcaje() {
        System.out.println("marcaje: 30");
    }

    @Override
    protected void definicion() {
        System.out.println("definicion: 99");
    }

    // Metodo propio de la interface delantero
    @Override
    public void goles() {
        System.out.println("cantidad de goles: 33");
    }

    @Override
    public void remates() {
        System.out.println("cantidad de remates: 61");
    }

}
