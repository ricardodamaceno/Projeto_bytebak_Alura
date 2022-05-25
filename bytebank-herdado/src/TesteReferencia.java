
public class TesteReferencia {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		
		g1.setNome("Ricardo");
		g1.setSalario(5000.0);		
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.);
		
		Desing ds = new Desing();
		ds.setSalario(2000.);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(ds);
		
		System.out.println(controle.getSoma());
	}
}
