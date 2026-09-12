
package com.mycompany.a05exec02;

/**
 *
 * @author unifgustasouza
 */
public class Politico {
    String nome, partido, estado, funcao;
    
    public Politico(){
        
    }

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Politico{" + "nome=" + nome + ", partido=" + partido + ", estado=" + estado + ", funcao=" + funcao + '}';
    }
    
    public void apresentacao (){
        System.out.println("---- APRESENTACAO POLITICO ----");
        System.out.println("Nome...: " + nome);
        System.out.println("Partido...: " + partido);
        System.out.println("Estado....: " + estado);
        System.out.println("Funcao....:" + funcao);
    }
}
