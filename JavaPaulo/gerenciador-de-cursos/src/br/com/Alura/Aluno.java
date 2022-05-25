package br.com.Alura;

public class Aluno {

	private String nome;
	private int numeroDaMatricula;

	public Aluno(String nome, int numeroDaMatricula) {
		if(nome == null) {
			throw new NullPointerException("Este nome não é válido");
		}
		this.nome = nome;
		this.numeroDaMatricula = numeroDaMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroDaMatricula() {
		return numeroDaMatricula;
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + this.nome + ", " + "Numero da Matricula: " + getNumeroDaMatricula();
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj; // <---- cast//
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		
		return this.nome.hashCode();
	}
}
