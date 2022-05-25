
public class TesteSistema {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente();
		cl.setSenha(222);
		
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador ad = new Administrador();
		ad.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(ad);
		si.autentica(cl);
						
	}

}
