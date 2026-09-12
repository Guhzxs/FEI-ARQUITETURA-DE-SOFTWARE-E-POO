
package com.mycompany.a05exec02;

/**
 *
 * @author unifgustasouza
 */
public class Prefeito extends Politico {
    String municipio;

    public Prefeito() {
    }

    public Prefeito(String nome, String partido, String estado) {
        super(nome, partido, estado, "Prefeito");
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Prefeito{" + "municipio=" + municipio + '}';
    }
    
    @Override
     public void apresentacao (){
        System.out.println("---- APRESENTACAO PREFEITO ----");
        System.out.println("Nome.........: " + getNome());
        System.out.println("Partido......: " + getPartido());
        System.out.println("Estado.......: " + getEstado());
        System.out.println("Funcao.......:" + getFuncao());
        System.out.println("Municipio...: " + municipio);
    }
    
}
