package desafios.estruturasDeRepeticao;

import java.util.Scanner;

/*
 * Fa�a um programa que leia 5 n�meros
 * e informe o maior n�mero e a m�dia
 * desses n�meros.
 * 
 * */
public class Maior_E_Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int limite = 0;
		int maior = 0;
		int media;
		int soma = 0;
		int qtd = 0;
		
		do {
			System.out.println("Numero: ");
			numero = entrada.nextInt();
			limite = limite + 1;
			
			soma = soma + numero;
			qtd++;
	
			if (numero > maior) {
				maior = numero;
			}
			
		} while (limite < 5);
		
		media = soma / qtd;
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + media);
		System.out.println("Maior: " + maior);
		entrada.close();
		System.out.println("Fim");
	}
	
}
