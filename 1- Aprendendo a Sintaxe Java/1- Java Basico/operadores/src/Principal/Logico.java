package Principal;

public class Logico {
	
	public static void condicaoE() {
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		String resultado = condicao1 && condicao2 ? "As duas s�o verdadeiras": "As duas condi��es n�o s�o verdadeiras";
		System.out.println(resultado);
	}
	
	public static void condicaoOU() {
		boolean condicao1 = false;
		boolean condicao2 = true;
		
		String resultado = condicao1 || condicao2 ? "Uma das condi��es � verdadeira": "As duas condi��es s�o falsas";
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		condicaoE();
		condicaoOU();
	}
}
