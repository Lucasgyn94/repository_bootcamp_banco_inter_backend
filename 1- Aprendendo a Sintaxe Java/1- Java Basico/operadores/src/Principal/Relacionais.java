package Principal;

public class Relacionais {
	
	public static void maiorIgual() {
		int a = 5;
		int b = 6;
		
		String resultado = a >= b ? "Verdadeiro" : "Falso";
		
		System.out.println(resultado);
	}
	
	public static void diferenteIgual() {
		int a = 5;
		int b = 6;
		
		String resultado = a != b ? "Verdadeiro" : "Falso";
		System.out.println(resultado);
	}
	
	public static void maior() {
		int a = 5;
		int b = 6;
		
		String resultado = a > b ? "Verdadeiro" : "Falso";
		System.out.println(resultado);
	}
	
	public static void menor() {
		int a = 5;
		int b = 6;
		
		String resultado = a < b ? "Verdadeiro" : "Falso";
		System.out.println(resultado);
	}
	
	public static void igual() {
		int a = 5;
		int b = 6;
		
		String resultado = a == b ? "Verdadeiro" : "Falso";
		System.out.println(resultado);
	}
	
	public static void comparaNomes() {
		String nome1 = "LUCAS";
		String nome2 = "LUCAS";
		
		System.out.println(nome1 == nome2);
		
	}
	
	public static void comparaNomesObjeto() {
		String nome1 = "LUCAS";
		String nome2 = new String("LUCAS");
		
		System.out.println(nome1.equals(nome2));	
	}
	public static void main(String[] args) {
		maior();
		menor();
		maiorIgual();
		diferenteIgual();
		igual();
		System.out.println("\n-------------------\n");
		comparaNomes();
		comparaNomesObjeto();
	}

}
