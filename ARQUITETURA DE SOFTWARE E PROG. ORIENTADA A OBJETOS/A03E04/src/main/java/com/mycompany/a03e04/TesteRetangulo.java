
package com.mycompany.a03e04;


public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(2, 4, 4, 4, 2, 2, 4, 2);
        
        r1.mostraDados();
        System.out.println("Perimetro r1.....: " + r1.perimetro());
        System.out.println("Area r1..........: " + r1.area());
        System.out.println("Comprimento r1...: "+ r1.comprimento());
        System.out.println("Largura r1.......: "+ r1.largura());
        
        Retangulo r2 = new Retangulo (-2, 4, 4, 4, 2, 2, 4, 2);
    }
}
