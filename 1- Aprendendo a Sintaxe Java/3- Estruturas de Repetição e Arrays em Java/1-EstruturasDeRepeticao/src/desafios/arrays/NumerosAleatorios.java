package desafios.arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) 
 * armazene-os num vetor. Ao final mostre os números e seus sucessores.
 * */
public class NumerosAleatorios {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int[] numerosAleatorios = new int[20]; // int numerosAleatorios[] = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = aleatorio.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Números aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		// definindo o antecessor
		System.out.println("\nAntecessores dos Números Aleatorios: ");
		
		for (int numero : numerosAleatorios) {
			System.out.print((numero - 1) + " ");
		}
		
		// definindo o sucessor de um número
		System.out.println("\nSucessores dos Números Aleatorios: ");
		
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
	}
}
