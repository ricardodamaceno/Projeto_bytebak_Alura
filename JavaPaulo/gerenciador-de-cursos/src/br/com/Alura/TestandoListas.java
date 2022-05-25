package br.com.Alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aula = new ArrayList<>();
		
		aula.add(aula1);
		aula.add(aula2);
		aula.add(aula3);
		
		System.out.println(aula);
		
		aula.remove(0);
		System.out.println(aula);
		
		for (String aulas : aula) {
			System.out.println("Aula: " + aulas);
			
		}
		
		String primeiraAula = aula.get(0);
		System.out.println("A primeira Aula é: " + primeiraAula);
		
		for (int i = 0; i<aula.size(); i++) {
			System.out.println(aula.get(i));
		}
		
		System.out.println(aula.size());
		
		aula.forEach(aulas -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aulas);});
		
		
		aula.add("Aumentando nosso Conhecimento");
		System.out.println(aula);
		Collections.sort(aula);
		System.out.println(aula);

	}

}
