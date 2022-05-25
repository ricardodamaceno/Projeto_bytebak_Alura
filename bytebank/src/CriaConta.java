
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("o saldo na primeira conta é " + primeiraConta.saldo);
		System.out.println("o saldo na segunda conta é " + segundaConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println(segundaConta.agencia);
		
	}
}
