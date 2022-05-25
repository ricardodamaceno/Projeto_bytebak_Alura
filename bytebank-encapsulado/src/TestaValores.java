
public class TestaValores {

	public static void main(String[] args) {
		

		Conta conta = new Conta(250, 50);
	
		
		System.out.println(conta.getAgencia());
		
		Conta conta1 = new Conta(282, 550);
		Conta conta2 = new Conta(2828, 540);
		
		System.out.println(Conta.getTotal());
	}
}
