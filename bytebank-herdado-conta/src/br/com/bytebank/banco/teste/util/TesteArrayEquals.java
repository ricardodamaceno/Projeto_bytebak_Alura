package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayEquals {

	public static void main(String[] args) {
		
//		Conta cc = new ContaCorrente(11, 22);
//		Conta cc2 = new ContaCorrente(11, 22);
//		
//		boolean igual = cc.equals(cc2);
//		System.out.println(igual);
		
		//<> Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
			
		Conta cc = new ContaCorrente(11, 22);	
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(11, 44);	
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(11, 44);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe: " + existe);
				
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
