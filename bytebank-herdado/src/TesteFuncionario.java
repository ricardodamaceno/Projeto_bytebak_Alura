
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario ricardo = new Gerente();
		ricardo.setNome("Ricardo");
		ricardo.setCpf("222.222.222-22");
		ricardo.setSalario(2600.0);
		
		System.out.println(ricardo.getNome());
		System.out.println(ricardo.getCpf());
		System.out.println(ricardo.getBonificacao());

	}

}
