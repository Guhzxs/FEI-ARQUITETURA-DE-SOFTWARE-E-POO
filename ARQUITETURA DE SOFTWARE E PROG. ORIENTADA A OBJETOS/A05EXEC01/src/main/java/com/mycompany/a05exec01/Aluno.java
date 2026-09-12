
package com.mycompany.a05exec01;

/**
 *
 * @author unifgustasouza
 */
public class Aluno extends Pessoa {
    private String curso;
    
    public Aluno (){
        
    }
    public Aluno (String curso, String nome, String sobrenome, int idade){
        super(nome, sobrenome, idade);
        this.curso = curso;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso (String curso){
        this.curso = curso;
    }
    
    public void print (){
        System.out.println("---- EXIBE ----");
        System.out.println("Nome..........:" + nome);
        System.out.println("Sobrenome.....:" + sobrenome);
        System.out.println("Curso.........:" + curso);
        System.out.println("Idade.........:" + idade);
    }
}
