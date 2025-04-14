package EjercicioIntegrador1;

public class Riquelme extends Jugadores implements InterfaceMediocampista{
    
    // Constructor
    public Riquelme()
    {

    }
    
    // Clases Abstractas
    @Override
    protected void reflejos() {
        System.out.println("reflejos: 70");
    }

    @Override
    protected void marcaje() {
        System.out.println("marcaje: 40");
    }

    @Override
    protected void definicion() {
        System.out.println("definicion: 89");
    }

    // Metodo propio de la interface mediocampista
    @Override
    public void asistencias() {
        System.out.println("cantidad de asistencias: 17");
    }

    @Override
    public void pases() {
        System.out.println("cantidad de pases: 555");
    }

    @Override
    public void recuperaciones() {
        System.out.println("cantidad de recuperaciones: 120");
    }

}
