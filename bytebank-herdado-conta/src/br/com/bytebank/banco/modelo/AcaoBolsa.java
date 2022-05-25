package br.com.bytebank.banco.modelo;

public class AcaoBolsa extends Conta implements Tributavel {

	public AcaoBolsa() {

	}

	@Override
	public double getValorImposto() {

		return super.saldo * .2;
	}

	@Override
	public void deposita(double valor) {

		super.saldo += valor;
	}

}
