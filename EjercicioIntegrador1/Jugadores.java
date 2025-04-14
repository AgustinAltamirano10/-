package EjercicioIntegrador1;

public abstract class Jugadores {
    // Atributos que van a tener todos los equipos y heredarlas
    protected String nombreEquipo;
    protected String pais;
    protected String estadio;
    protected int pts;
    protected int posicion;

    // Declaracion de métodos abstractos
    protected abstract void reflejos();
    protected abstract void marcaje();
    protected abstract void definicion();
}
