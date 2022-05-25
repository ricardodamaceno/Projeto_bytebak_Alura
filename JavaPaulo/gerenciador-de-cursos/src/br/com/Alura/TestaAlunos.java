package br.com.Alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");
        alunos.add("Alberto");
        
        
        
        for (String aluno : alunos) {
			System.out.println(aluno);
		}
        
        System.out.println(alunos.size());

        //alunos.remove("Paulo");
        System.out.println(alunos.size());
        System.out.println(alunos.contains("Alberto"));

	}
	

}
