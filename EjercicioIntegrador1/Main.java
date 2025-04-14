package EjercicioIntegrador1;

public class Main {
    public static void main(String[] args) {
    // Creo objetos de cada uno
    Neuer neuer = new Neuer();
    Maldini maldini = new Maldini ();
    Riquelme riquelme = new Riquelme();
    Ronaldo ronaldo = new Ronaldo();
    
    // Métodos para neuer
    System.out.println("Estadisticas Manuel Neuer");
    neuer.reflejos();
    neuer.marcaje();
    neuer.definicion();

    neuer.salvadas();
    neuer.tirosPenales();
    System.out.println("##################################################");
    // Métodos para maldini
    System.out.println("Estadisticas Paolo Maldini");
    maldini.reflejos();
    maldini.marcaje();
    maldini.definicion();

    maldini.bloqueos();
    maldini.faltas();
    maldini.tarjetas();
    System.out.println("##################################################");
    // Métodos para riquelme
    System.out.println("Estadisticas Juan Roman Riquelme");
    riquelme.reflejos();
    riquelme.marcaje();
    riquelme.definicion();

    riquelme.asistencias();
    riquelme.pases();
    riquelme.recuperaciones();
    System.out.println("##################################################");
    // Métodos para ronaldo
    System.out.println("Estadisticas Ronaldo Nazario");
    ronaldo.reflejos();
    ronaldo.marcaje();
    ronaldo.definicion();

    ronaldo.goles();
    ronaldo.remates();
    }
}
