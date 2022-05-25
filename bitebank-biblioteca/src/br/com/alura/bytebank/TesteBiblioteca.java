package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(222, 222);
		cc.deposita(201);
		
		System.out.println(cc.getSaldo());
		
	}

}
