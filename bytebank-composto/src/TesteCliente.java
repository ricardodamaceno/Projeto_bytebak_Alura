
public class TesteCliente {

	public static void main(String[] args) {
		Cliente ricardo = new Cliente();
		ricardo.nome = "Ricardo";
		ricardo.cpf = "222.222.222-22";
		ricardo.profissão = "Programador";
		
		Conta contaDoRicardo = new Conta();
		contaDoRicardo.deposita(500);
		
		contaDoRicardo.titular = ricardo;
		
		System.out.println(contaDoRicardo.titular.profissão);
		System.out.println(contaDoRicardo.getSaldo());
		System.out.println(ricardo);
	}
}
