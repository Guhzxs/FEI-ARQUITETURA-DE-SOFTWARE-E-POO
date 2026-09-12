
package com.mycompany.a05exec03;

/**
 *
 * @author unifgustasouza
 */
public class NavioDeGuerra extends Navio{
    private float blindagem, ataque;
    
    public NavioDeGuerra (){
        
    }

    public NavioDeGuerra(float blindagem, float ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }
    
    

    public float getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(float blindagem) {
        this.blindagem = blindagem;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }
    
    public void poderDeFogo(){
        System.out.println("Valor do ataque: " + ataque);
    }
    
    public void exibirArmas(){
        exibirInfoGeral();
        System.out.println("Blindagem..............: " + blindagem);
        poderDeFogo();
    }
    
    
}
