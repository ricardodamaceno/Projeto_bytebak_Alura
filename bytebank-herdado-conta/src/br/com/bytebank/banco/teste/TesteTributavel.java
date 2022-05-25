package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(444, 555);
		cc.deposita(100);		
		
		SeguroVida seguro = new SeguroVida();
		
		AcaoBolsa ac = new AcaoBolsa();
		ac.deposita(100);
				
		CalculadoraImposto calc = new CalculadoraImposto();
		calc.registra(seguro);
		calc.registra(cc);
		calc.registra(ac);
		
		System.out.println(calc.getTotalImposto());
		System.out.println(ac.getValorImposto());
				

	}

}
