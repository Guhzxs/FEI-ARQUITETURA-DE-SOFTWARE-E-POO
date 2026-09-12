
package com.mycompany.a05exec03;

/**
 *
 * @author unifgustasouza
 */
public class Cruzador extends NavioDeGuerra {
    int numCanhoes;
    
    public Cruzador(){
        
    }

    public Cruzador(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }

    public Cruzador(int numCanhoes, float blindagem, float ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }
    
    public void poderDeFogo(){
        System.out.println("Ataque.....: " + getAtaque() * Math.sqrt(numCanhoes));
        
    }
    
    
    
}
