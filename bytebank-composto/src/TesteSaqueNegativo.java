
public class TesteSaqueNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.getSaldo());
		
		System.out.println(conta.saca(101));
		
	}
}
