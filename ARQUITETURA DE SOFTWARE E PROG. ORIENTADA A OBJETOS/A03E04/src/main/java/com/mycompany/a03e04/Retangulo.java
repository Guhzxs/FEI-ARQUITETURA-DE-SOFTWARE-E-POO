
package com.mycompany.a03e04;

public class Retangulo {
    //atributos
    private double x1, y1, x2, y2, x3, y3, x4, y4;
    
    
    //metodos
    
    //construtor totalmente parametrizado
    public Retangulo (double x1, double y1, double x2, double y2, 
            double x3, double y3, double x4, double y4){
        set(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public void set (double x1, double y1, double x2, double y2, 
            double x3, double y3, double x4, double y4) {
        //verificar se os valores estão no limite definido ( >= 0 and <= 20)
        if (x1 < 0 || x1 > 20 || 
            y1 < 0 || y1 > 20 ||
            x2 < 0 || x2 > 20 || 
            y2 < 0 || y2 > 20 ||
            x3 < 0 || x3 > 20 || 
            y3 < 0 || y3 > 20 ||
            x4 < 0 || x4 > 20 || 
            y4 < 0 || y4 > 20) {
            System.out.println("Coordenadas são invalidas!");
            return;
        }
        
        //verificar se os pontos formam um retangulo
        if (y1 != y2 ||
            y3 != y4 ||
            x1 != x3 ||
            x2 != x4){
            System.out.println("Os pontos não formam um retângulo!");
            return;
        }
        
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        
    }
    
    public double comprimento(){
        double horizontal = Math.abs(x2 - x1);
        double vertical = Math.abs(y4 - y1);
        
        if (horizontal > vertical){
            return horizontal;
        } else {
            return vertical;
        }
    }
    
    public double largura(){
        double horizontal = Math.abs(x2 - x1);
        double vertical = Math.abs(y4 - y1);
        
        if(horizontal < vertical){
            return horizontal;
        } else {
            return vertical;
        }
    }
    
    public double area(){
        return largura()*comprimento();
    }
    
    public double perimetro(){
        return 2*comprimento()+2*largura();
    }
    
    public void mostraDados(){
        System.out.println("X1: " + x1 + ", Y1: " + y1);
        System.out.println("X2: " + x2 + ", Y2: " + y2);
        System.out.println("X3: " + x3 + ", Y3: " + y3);
        System.out.println("X4: " + x4 + ", Y4: " + y4);
    }
}
