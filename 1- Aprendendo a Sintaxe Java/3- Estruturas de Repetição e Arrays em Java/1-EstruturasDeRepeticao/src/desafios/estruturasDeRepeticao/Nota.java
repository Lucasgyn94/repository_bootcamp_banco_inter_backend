package desafios.estruturasDeRepeticao;

import java.util.Scanner;

/*
 * Fa�a um progrmaa que pe�a uma nota entre 0 e 10;
 * Mostre uma mensagem caso o valor seja inv�lido
 * e continue pedindo at� que o usu�rio informe um valor
 * v�lido
 * 
 * */

public class Nota {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10: ");
		int nota = entrada.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida.");
			System.out.println("Digite uma nota v�lida entre 0 e 10: ");
			nota = entrada.nextInt();
		}
		entrada.close();
		System.out.println("Fim!");
	}

}
