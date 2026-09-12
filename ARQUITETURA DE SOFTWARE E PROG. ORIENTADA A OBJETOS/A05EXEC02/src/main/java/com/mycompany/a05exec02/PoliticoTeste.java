
package com.mycompany.a05exec02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifgustasouza
 */
public class PoliticoTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Vereador> vereadores = new ArrayList<>();
        ArrayList<Prefeito> prefeitos = new ArrayList<>();
        
        String nomeL, partidoL, estadoL, municipioL;
        
        System.out.println("--- ENTRADA DE DADOS ---");
        
        for(int i = 0; i < 3; i++){
            System.out.println("Informe o nome: ");
            nomeL = teclado.nextLine();
            System.out.println("Informe o partido: ");
            partidoL = teclado.nextLine();
            System.out.println("Informe o estado: ");
            estadoL = teclado.nextLine();
            System.out.println("Informe o municipio: ");
            municipioL = teclado.nextLine();
            vereadores.add(new Vereador(municipioL, nomeL, partidoL, estadoL));
            
        }
        
        for (Prefeito p: prefeitos){
            p.apresentacao();
        }
        
        for(Vereador v: vereadores){
            v.apresentacao();
        }
    }
}
