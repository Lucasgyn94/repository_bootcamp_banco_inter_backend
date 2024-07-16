package Principal;

public class Logico {
	
	public static void condicaoE() {
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		String resultado = condicao1 && condicao2 ? "As duas são verdadeiras": "As duas condições não são verdadeiras";
		System.out.println(resultado);
	}
	
	public static void condicaoOU() {
		boolean condicao1 = false;
		boolean condicao2 = true;
		
		String resultado = condicao1 || condicao2 ? "Uma das condições é verdadeira": "As duas condições são falsas";
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		condicaoE();
		condicaoOU();
	}
}
