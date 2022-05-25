package br.com.Alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaCurso = new Curso("Primeiro Curos", "Ricardo");
		
		//javaCurso.getAulas().add(new Aula ("Trabalhando com ArrayList", 21));
		javaCurso.adiciona(new Aula ("Trabalhando com ArrayList", 21));
		javaCurso.adiciona(new Aula ("Criando uma Aula", 20));
		javaCurso.adiciona(new Aula ("Modelando com colecoes", 24));
		System.out.println(javaCurso.getAulas());

	}

}
