package br.com.Alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaCurso = new Curso("Primeiro Curos", "Ricardo");
		
		//javaCurso.getAulas().add(new Aula ("Trabalhando com ArrayList", 21));
		javaCurso.adiciona(new Aula ("Trabalhando com ArrayList", 21));
		javaCurso.adiciona(new Aula ("Criando uma Aula", 20));
		javaCurso.adiciona(new Aula ("Modelando com colecoes", 24));
		//System.out.println(javaCurso.getAulas());

		List<Aula> aulasImutaveis = javaCurso.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaCurso.getTempoTotal());
		System.out.println(javaCurso);
		
	}

}
