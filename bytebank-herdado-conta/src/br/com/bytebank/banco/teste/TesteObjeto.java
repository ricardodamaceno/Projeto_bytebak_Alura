package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObjeto {

	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(11, 22);
		Object cp = new ContaPoupanca(33, 44);
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());

	}

}
