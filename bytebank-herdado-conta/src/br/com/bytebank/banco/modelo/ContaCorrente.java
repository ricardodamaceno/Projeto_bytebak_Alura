package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	// aqui houve uma reescrita do metodo saca, digitando o nome-
	// -do metodo e apertando ctrl + sapaço, o eclipse te dá-
	// -a sujestão de reescrever o metodo
	@Override
	public void saca(double valor) throws SaldoInsuficiente {
		double testeSaca = valor + 0.2;
		super.saca(testeSaca);
	}

	// metodos da classe mãe são obrigados a serem preenchidos-
	// -com exceção dos get e set
	@Override
	public void deposita(double valor) {

		super.saldo += valor;

	}

	// métodos da interface tbm são obrigados a serem preenchidos-
	// -assim que são implementados na classe
	@Override
	public double getValorImposto() {

		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		
		return "ContaCorrente, " + super.toString();
	}
}
