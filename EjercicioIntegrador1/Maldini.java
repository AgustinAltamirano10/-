package EjercicioIntegrador1;

public class Maldini extends Jugadores implements InterfaceDefensor {
    
    // Constructor
    public Maldini()
    {

    }
    
    // Clases Abstractas
    @Override
    protected void reflejos() {
        System.out.println("reflejos: 68");
    }

    @Override
    protected void marcaje() {
        System.out.println("marcaje: 98");
    }

    @Override
    protected void definicion() {
        System.out.println("definicion: 35");
    }

    // Metodo propio de la interface defensor
    @Override
    public void bloqueos() {
        System.out.println("cantidad de bloqueos: 45");
    }

    @Override
    public void faltas() {
        System.out.println("cantidad de faltas: 35");
    }

    @Override
    public void tarjetas() {
        System.out.println("tarjetas: 8");
    }

}
