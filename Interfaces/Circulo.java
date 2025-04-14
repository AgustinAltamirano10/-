package Interfaces;
public class Circulo implements Figura, Dibujable, Rotable { // "implements" sirve para interfaces

    private double radio;
    
    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    @Override
    public double calcularArea() 
    {
        double resultado = (radio * radio) / 2; 
        return resultado;
    }

    @Override
    public void dibujar() 
    {
        System.out.println("Dibujar Circulo");
    }
    
    @Override
    public void rotar() 
    {
        System.out.println("Rotar Circulo");
    }
    

}
