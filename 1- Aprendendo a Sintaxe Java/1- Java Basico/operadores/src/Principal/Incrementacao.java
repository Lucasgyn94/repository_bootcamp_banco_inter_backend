package Principal;

public class Incrementacao {

	public static void imprimeBoolean() {
		boolean variavel = true;
		
		System.out.println(variavel);
		
		variavel = !variavel;
		
		System.out.println(variavel);
	}
	public static void main(String[] args) {
		int numero = 5;
		int numero2 = 1;
		
		numero = numero + 1; // incrementacao
		System.out.println(numero);
		
		numero += 1;
		System.out.println(numero);
		
		numero = numero - 1; // decrementacao
		System.out.println(numero);
		
		numero -= numero;
		System.out.println(numero);
		
		System.out.println("\n-------------------------\n");
		numero2 = --numero2;
		System.out.println(numero2);
		
		numero2 = ++numero2;
		System.out.println(numero2);
		
		System.out.println("\n--------------------------\n");
		
		imprimeBoolean();
	}

}
