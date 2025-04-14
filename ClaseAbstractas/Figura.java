package ClaseAbstractas;

public abstract class Figura {
    
    protected double x;
    protected double y;

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea(); // No lo implemento para que circulo y cuadrado lo implementen como quieran
    
}
