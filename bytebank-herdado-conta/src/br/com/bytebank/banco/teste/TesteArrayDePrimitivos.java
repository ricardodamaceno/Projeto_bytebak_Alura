package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int [] idade = new int[5];
		
		for (int i = 0; i < idade.length; i++) {
			idade[i] = i*i;
		}
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
		// forma literal 
		int [] ref = {11,22,33,44,55};
		
		System.out.println(ref[1]);
	}

}
