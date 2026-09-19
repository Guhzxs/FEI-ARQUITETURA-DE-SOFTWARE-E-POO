
package com.mycompany.a06exec02;

/**
 *
 * @author unifgustasouza
 */
public class Retangulo extends Formas{
    private double comprimento, largura;

    public Retangulo() {
    }

    public Retangulo(double comprimento, double largura, String tipo) {
        super(tipo);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    @Override
    public double perimetro(){
        return 2 * comprimento + 2 * largura;
    }
    
    @Override
    public void print(){
        System.out.println("Tipo...............: " + getTipo());
        System.out.println("Comprimento........: " + comprimento);
        System.out.println("Largura............: " + largura);
        System.out.println("Perimetro..........: " + perimetro());
    }
}
