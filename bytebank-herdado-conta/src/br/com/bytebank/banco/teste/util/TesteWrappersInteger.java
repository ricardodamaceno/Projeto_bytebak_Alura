package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersInteger {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autboxing	
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef);
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef);
		
		Number refNumber = Float.valueOf(29.9f);
		System.out.println(refNumber);
		
		List <Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.5f);
		
		
	}

}
