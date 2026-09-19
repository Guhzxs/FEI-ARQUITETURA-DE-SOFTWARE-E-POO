
package com.mycompany.a06exec05;

/**
 *
 * @author unifgustasouza
 */
public class Empresario extends Agente{
    private String empresa;
    
    public Empresario(){
        
    }

    public Empresario(String nome, String profissao, String empresa) {
        super(nome, profissao);
        this.empresa = empresa;
    }
    
    @Override
    public void apresentacao(){
       if(isModoAgente()){
           System.out.println("--- APRESENTACAO ---");
           System.out.println("Nome..............: " + getNome());
           System.out.println("Profissao.........: " + getProfissao());
           System.out.println("Empresa...........: " + empresa);
           
       } 
    }
}
