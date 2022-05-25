package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int [] idade = new int[5];
		Object [] referencias = new Object [5];
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(33, 44);
		
		referencias[1] = cc2;
		
		//System.out.println(contas[1].getAgencia());
		
		ContaCorrente ref = (ContaCorrente) referencias[0]; // type cast 
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(contas[0].getAgencia());
		
		System.out.println(ref.getAgencia());
		
		System.out.println(cc1.getAgencia());
		
		

	}

}
