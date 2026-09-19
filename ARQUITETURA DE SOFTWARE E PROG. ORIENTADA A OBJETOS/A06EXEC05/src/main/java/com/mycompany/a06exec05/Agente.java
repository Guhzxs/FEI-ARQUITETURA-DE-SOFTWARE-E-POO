
package com.mycompany.a06exec05;

/**
 *
 * @author unifgustasouza
 */
public abstract class Agente {
    private String nome, profissao;
    private boolean modoAgente;
    
    public Agente(){
        
    }

    public Agente(String nome, String profissao, boolean modoAgente) {
        this.nome = nome;
        this.profissao = profissao;
        this.modoAgente = modoAgente;
    }
    
    public abstract void apresentacao();
    
    public void modoAgenteOn(){
        modoAgente = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isModoAgente() {
        return modoAgente;
    }

    public void setModoAgente(boolean modoAgente) {
        this.modoAgente = modoAgente;
    }
    
    
}
