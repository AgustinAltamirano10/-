package EjercicioIntegrador1;

public class Neuer extends Jugadores implements InterfaceArquero{
    
    // Constructor
    public Neuer()
    {

    }

    // Clases Abstractas
    @Override
    protected void reflejos() {
        System.out.println("reflejos: 96");
    }

    @Override
    protected void marcaje() {
        System.out.println("marcaje: 25");
    }

    @Override
    protected void definicion() {
        System.out.println("definicion: 15");
    }

    // Metodo propio de la interface arquero
    @Override
    public void salvadas() {
        System.out.println("salvadas: 55");
    }

    @Override
    public void tirosPenales() {
        System.out.println("penales atajados: 14");
    }


}
