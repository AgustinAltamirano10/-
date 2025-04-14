package Interfaces;

public class Cuadrado implements Figura, Dibujable { // se pone una coma y se agregan las interfaces
    
    private double lado;



    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujar cuadrado");
    }


}
