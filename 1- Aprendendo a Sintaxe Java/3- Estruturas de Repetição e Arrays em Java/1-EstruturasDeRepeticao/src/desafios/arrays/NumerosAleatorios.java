package desafios.arrays;

import java.util.Random;

/*
 * Fa�a um programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) 
 * armazene-os num vetor. Ao final mostre os n�meros e seus sucessores.
 * */
public class NumerosAleatorios {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int[] numerosAleatorios = new int[20]; // int numerosAleatorios[] = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = aleatorio.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("N�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		// definindo o antecessor
		System.out.println("\nAntecessores dos N�meros Aleatorios: ");
		
		for (int numero : numerosAleatorios) {
			System.out.print((numero - 1) + " ");
		}
		
		// definindo o sucessor de um n�mero
		System.out.println("\nSucessores dos N�meros Aleatorios: ");
		
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
	}
}
