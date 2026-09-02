
package com.mycompany.lab03exec04;


public class Disciplina {
    private String codigo, nome;
    private Professor isaac; //agregação

    public Disciplina(String codigo, String nome, Professor isaac) {
        this.codigo = codigo;
        this.nome = nome;
        this.isaac = isaac;
    }
    
    
}
