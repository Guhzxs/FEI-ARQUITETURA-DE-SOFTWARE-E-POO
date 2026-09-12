
package com.mycompany.a05exec03;

/**
 *
 * @author unifgustasouza
 */
public class NavioMercante extends Navio{
    float capacidadeCarga = 25000, carga = 10000, volume = carga/capacidadeCarga;
    
    public NavioMercante(){
        
    }
    
    public NavioMercante(String nome, int numTripulantes){
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    
    public float getVolume(){
        return volume;
    }
    
    public void setVolume(){
        this.volume = volume;
    }
   
    
    public void carregamento (){
        System.out.println("Nome...................: " + nome);
        System.out.println("Numero de Tripulantes..: " + numTripulantes);
        System.out.println("Volume do Navio........: " + volume);
    }
}
