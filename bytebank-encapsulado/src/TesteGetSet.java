
public class TesteGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(250, 50);
		
		
		System.out.println(conta.getAgencia());
		
		Cliente ricardo = new Cliente();
		
		ricardo.setNome("Ricardo");
		
		conta.setTitular(ricardo);
		
		conta.getTitular().setProfissão("programador");
		System.out.println(ricardo.getProfissão());
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(ricardo.getNome());
		
		conta.deposita(150);
		System.out.println(conta.getSaldo());
		
		
		
		
	}
}
