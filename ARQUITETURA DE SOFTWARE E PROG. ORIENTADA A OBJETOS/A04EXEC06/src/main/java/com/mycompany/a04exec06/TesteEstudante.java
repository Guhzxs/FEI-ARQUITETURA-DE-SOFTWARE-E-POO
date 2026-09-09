
package com.mycompany.a04exec06;

import java.util.ArrayList;

public class TesteEstudante {
    public static void main(String[] args) {
        
        ArrayList<Estudante> estudantes = new ArrayList<>();
        Estudante estudante01 = new Estudante("Vinicius", "Santos");
        Estudante estudante02 = new Estudante("Gustavo", "Bubu");
        
        System.out.println(estudante01);
        System.out.println(estudante02);
        
        for(int i = 0; i < 30; i++){
            estudantes.add(new Estudante("Vinicius", "Santos"));
        }
        for(Estudante estudante: estudantes){
            System.out.println(estudante);
        }
    }
}
