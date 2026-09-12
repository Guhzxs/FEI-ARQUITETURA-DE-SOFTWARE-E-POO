
package com.mycompany.a05exec03;

/**
 *
 * @author unifgustasouza
 */
public class Navio {
     int numTripulantes;
     String nome;
    
    public Navio(){
        
    }
    
    public Navio(int numTripulantes, String nome){
        this.numTripulantes = numTripulantes;
        this.nome = nome;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibirInfoGeral (){
        System.out.println("Numero de Tripulantes...: " + numTripulantes);
        System.out.println("Nome....................: " + nome);
    }

    @Override
    public String toString() {
        return "Navio{" + "numTripulantes=" + numTripulantes + ", nome=" + nome + '}';
    }
    
    
    
}
