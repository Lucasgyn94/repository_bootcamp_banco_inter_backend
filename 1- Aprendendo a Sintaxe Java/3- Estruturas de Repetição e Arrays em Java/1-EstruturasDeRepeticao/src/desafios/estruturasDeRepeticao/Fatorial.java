package desafios.estruturasDeRepeticao;

import java.util.Scanner;

/*
 * Fa�a um programa que calcule o fatorial de um n�mero
 * inteiro fornecido pelo usu�rio.
 * Ex: 5! = 5 x 4 x 3 x 2 x 1
 * */
public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Fatorial");
		int fatorial = entrada.nextInt();
		
		int multiplicacao = 1;
		
		System.out.println(fatorial + "! = ");
		
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println(multiplicacao);
		
		entrada.close();
		
	}
}
