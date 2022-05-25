package br.com.Alura;

public class TesteCursoAluno {

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
		
		System.out.println("Todos os alunos matriculados");
		javaCurso.getAlunos().forEach(i -> {
			System.out.println(i);
		});
		
		System.out.println("O Aluno esta matriculado?");
		System.out.println(javaCurso.alunoEstaMatriculado(a1));
		
		Aluno nome = new Aluno("Ricardo", 1);
		System.out.println("O Ricardo está matriculado?");
		System.out.println(javaCurso.alunoEstaMatriculado(nome));
		System.out.println("O a1 é igual ao Ricardo: ");
		System.out.println(a1.equals(nome));
		
		
		
		
	}

}
