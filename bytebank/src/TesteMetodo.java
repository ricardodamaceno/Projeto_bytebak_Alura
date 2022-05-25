
public class TesteMetodo {

		public static void main(String[] args) {
			Conta contaDoRicardo = new Conta();
			contaDoRicardo.saldo = 100;
			contaDoRicardo.deposita(50);
			
			System.out.println(contaDoRicardo.saldo);
			
		
			boolean conseguiuRetirar =  contaDoRicardo.saca(20);
			System.out.println(contaDoRicardo.saldo);
			System.out.println(conseguiuRetirar);
			
			Conta contaDaMarcela = new Conta();
			contaDaMarcela.saldo = 1000;
			
			if(contaDaMarcela.transfere(100, contaDoRicardo)) {
				System.out.println("tramferência com sucesso");
			} else {
				System.out.println("deu ruim");
			}
			
			
			System.out.println(contaDaMarcela.saldo);
			System.out.println(contaDoRicardo.saldo);
		}
}
