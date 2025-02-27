package desafios.arrays;

import java.util.Scanner;

/*
 * Fa�a um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 * */
public class Consoantes {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int qtdConsoantes = 0;
		int contador = 0;
		
		do {
			System.out.println("Letra: ");
			String letra = entrada.next();
			
			// definindo se vogal ou consoante
			if ( !(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u"))) {
				consoantes[contador] = letra;
				qtdConsoantes++;
			}
			contador++;
		} while (contador < consoantes.length);
		
		System.out.println("Consoantes: ");
		for (String consoante : consoantes ) {
			if (consoante != null) {
				System.out.println(consoante + " ");	
			}
		}
		System.out.println("Quantidade de consoantes: " + qtdConsoantes);;
		
		entrada.close();
	}
}
