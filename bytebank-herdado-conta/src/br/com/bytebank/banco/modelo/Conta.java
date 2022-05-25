package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Ricardo
 *
 */


// classe abstract não pode ser instanciada
public abstract class Conta implements Comparable<Conta>, Serializable {

	// Atributos
	// protected só pode ser acessado pelo objeto filho
	protected double saldo;
	// private não pode ser acessado pelo objeto
	private int agencia;
	private int numero;
	private transient Cliente titular;
	// static: metodos static podem ser chamados ivocando-
	//a clase, sem a necessidade de instanciar um objeto
	public static int total = 0;

	// construtor padrão
	public Conta() {

	}
	

	/**
	 * Construtor para inicializar um objeto a partir da agencia e numero da conta
	 * 
	 * @param agencia
	 * @param numero
	 */
	// construtor com parâmetros
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	// método abstract não tem corpo e é obrigado a preencher quando uma classe-
	// -é extendedida por esta que contem o abstract
	public abstract void deposita(double valor);

	// método
	public void saca(double valor) throws SaldoInsuficiente {

		if (this.saldo < valor) {
			throw new SaldoInsuficiente("Slado " + this.saldo + ", Valor " + valor);
		}
		this.saldo -= valor;

	}

	// método
	public void transfere(double valor, Conta destino) throws SaldoInsuficiente {
		this.saca(valor);
		destino.deposita(valor);

	}

	// método get e set
	public double getSaldo() {
		return this.saldo;
	}

	// método get precisa retornar algo
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	@Override
	public boolean equals (Object ref) {
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + "," + " Saldo: " + this.saldo;
	}

}