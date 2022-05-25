package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficiente;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(444, 555);
		conta.deposita(200);
		
		try {
		conta.saca(210);
		}catch(SaldoInsuficiente ex) {
			System.out.println("EX: " + ex.getMessage());
		}
		System.out.println(conta.getSaldo());

	}

}
