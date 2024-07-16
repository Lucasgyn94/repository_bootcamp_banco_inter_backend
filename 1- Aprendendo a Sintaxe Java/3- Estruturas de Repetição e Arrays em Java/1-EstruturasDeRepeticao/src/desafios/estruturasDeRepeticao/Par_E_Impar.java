package desafios.estruturasDeRepeticao;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a N n�meros inteiros,
 * calcule e mostre a quantidade de n�meros pares
 * e a quantidade de n�meros impares
 * */
public class Par_E_Impar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdNumeros;
		int limite = 0;
		int numero;
		int qtdPares = 0;
		int qtdImpares = 0;
		
		System.out.println("Quantidade de n�meros: ");
		qtdNumeros = entrada.nextInt();
		
		do {
			System.out.println("N�mero: ");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				qtdPares = qtdPares + 1;
			} else {
				qtdImpares = qtdImpares + 1;
			}
			
			
			limite = limite + 1;
			
		} while (limite < qtdNumeros);
		entrada.close();
		System.out.println("Quantidade de pares: " + qtdPares);
		System.out.println("Quantidade de impares: " + qtdImpares);
		System.out.println("Fim");
	}
}
