package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutroWrappers {

	public static void main(String[] args) {
		
		
		int idade = 29; //Integrer
		Integer idadeRef = Integer.valueOf(29); //autboxing
		
		System.out.println(idadeRef.doubleValue());
		System.out.println(idadeRef.MAX_VALUE);
		System.out.println(idadeRef.MIN_VALUE);
		System.out.println(idadeRef.SIZE);
		System.out.println(idadeRef.BYTES);
		System.out.println(idadeRef.TYPE);
		
		int valor = idadeRef.intValue(); //unboxing
		System.out.println(valor);
		
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		
		//System.out.println(numero);
		

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxig
	}

}
