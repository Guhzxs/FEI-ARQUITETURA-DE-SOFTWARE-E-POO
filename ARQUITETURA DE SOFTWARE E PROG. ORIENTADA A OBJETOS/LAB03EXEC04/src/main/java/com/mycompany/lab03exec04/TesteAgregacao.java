/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03exec04;

/**
 *
 * @author unifgustasouza
 */
public class TesteAgregacao {
    public static void main(String[] args) {
        
        Professor prof = new Professor ("Gabriela", "CC");
        Disciplina disc = new Disciplina("OO", "CCM310", prof);
        Aluno aluno01 = new Aluno("Gustavo", "222250342" , "CC", disc);
    }
}
