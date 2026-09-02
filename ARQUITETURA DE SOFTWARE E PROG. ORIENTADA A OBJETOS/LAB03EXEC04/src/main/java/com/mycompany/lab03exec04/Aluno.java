
package com.mycompany.lab03exec04;


public class Aluno {
    private String nome, ra, curso;
    private Disciplina disciplina; //agregação

    public Aluno(String nome, String ra, String curso, Disciplina disciplina) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.disciplina = disciplina;
    }
    
    
}
