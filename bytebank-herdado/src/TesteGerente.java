
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(222);
		
		Gerente g1 = new Gerente();
		g1.setNome("Ricardo");
		g1.setCpf("222.222.222-22");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(222);

		
		boolean autentica =g1.autenticacao(222);
		System.out.println(autentica);
		
		//boolean autenticar =gerente.autenticacao(222);
		System.out.println(gerente.autenticacao(222));
		
		//g1.getBonificacao();
		System.out.println(g1.getBonificacao());

	}

}
