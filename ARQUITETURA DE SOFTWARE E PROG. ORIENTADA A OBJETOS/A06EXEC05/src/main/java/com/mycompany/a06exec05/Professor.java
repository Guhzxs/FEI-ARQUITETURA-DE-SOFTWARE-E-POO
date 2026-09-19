/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06exec05;

/**
 *
 * @author unifgustasouza
 */
public class Professor extends Agente{
    private String escola;
    
    public Professor(){
        
    }

    public Professor(String escola) {
        this.escola = escola;
    }

    public Professor(String escola, String nome, String profissao, boolean modoAgente) {
        super(nome, profissao, modoAgente);
        this.escola = escola;
    }
    
    @Override
    public void apresentacao(){
        if(isModoAgente()){
            System.out.println("--- APRESENTACAO ---");
            System.out.println("AGENTE SMITH");
        } else {
            System.out.println("--- APRESENTACAO ---");
            System.out.println("Nome..............: " + getNome());
            System.out.println("Profissao.........: " + getProfissao());
            System.out.println("Escola............: " + escola);
        }
    }
}
