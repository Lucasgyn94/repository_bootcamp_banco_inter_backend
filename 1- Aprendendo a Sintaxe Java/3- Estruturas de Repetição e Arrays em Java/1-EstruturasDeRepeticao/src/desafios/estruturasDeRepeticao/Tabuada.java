package desafios.estruturasDeRepeticao;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10;
 * o usu�rio deve informa de qual n�mero ele deseja ver a tabuada.
 * A sa�da deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 * */

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = entrada.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
		
		entrada.close();

	}

}
