package desafios.estruturasDeRepeticao;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares
 * */
public class Par_E_Impar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdNumeros;
		int limite = 0;
		int numero;
		int qtdPares = 0;
		int qtdImpares = 0;
		
		System.out.println("Quantidade de números: ");
		qtdNumeros = entrada.nextInt();
		
		do {
			System.out.println("Número: ");
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
