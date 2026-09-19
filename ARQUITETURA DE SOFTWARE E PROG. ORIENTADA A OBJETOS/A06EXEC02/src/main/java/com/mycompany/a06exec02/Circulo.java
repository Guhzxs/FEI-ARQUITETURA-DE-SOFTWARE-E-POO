
package com.mycompany.a06exec02;

/**
 *
 * @author unifgustasouza
 */
public class Circulo extends Formas{
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String tipo) {
        super(tipo);
        this.raio = raio;
    }
    
    public double area() {
        return 3.14159 * (raio * raio);
    }
    
    public double perimetro(){
        return 2 * 3.14159 * raio;
    }
    
    @Override
    public void print(){
        System.out.println("Tipo...............: " + getTipo());
        System.out.println("Raio...............: " + raio);
        System.out.println("Area...............: " + area());
        System.out.println("Perimetro..........: " + perimetro());
    }
}
