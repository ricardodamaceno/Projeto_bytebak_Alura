package br.com.Alura;

public class TesteBuscaAluno {

	public static void main(String[] args) {
		Curso javaCurso = new Curso("Primeiro Curos", "Ricardo");
		
		Aluno a1 = new Aluno("Ricardo", 1);
		Aluno a2 = new Aluno("Paulo Turini", 2);
		Aluno a3 = new Aluno("Alberto", 3);
		Aluno a4 = new Aluno("Nico", 4);

		javaCurso.matricula(a1);
		javaCurso.matricula(a2);
		javaCurso.matricula(a3);
		javaCurso.matricula(a4);

		System.out.println("Quem é o aluno 1?");
		Aluno aluno = javaCurso.getBuscaAluno(1);
		System.out.println(aluno);

	}

}
