
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("TestaCondicional");
		int idade = 16;
		int pessoas = 3;
		
		//boolean acompanhado = pessoas >=2;
		
		boolean acompanhado;
		
		if (pessoas >=2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 ||acompanhado && idade <= 18) {
			System.out.println("pode entrar");
		} else {
			System.out.println("não pode entrar");
		}
 
	}
}
