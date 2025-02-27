package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
Fa�a um programa que simule um lan�amento de dados. 
Lance o dado 100 vezes e armazene. Depois, mostre quantas 
vezes cada valor foi conseguido.
 */
public class Main {
	public static void main(String[] args) {
	
		int qtdLancamento = 100;
		List<Integer> valores = new ArrayList<>();
		Random geradorDeLancamento = new Random();
		
		for (int i = 0; i <= qtdLancamento; i++) {
			int numero = geradorDeLancamento.nextInt(6) + 1;
			valores.add(numero);
		}
		
		Map<Integer, Integer> lancamentos = new HashMap<>();
		for (Integer resultado : valores) {
			if (lancamentos.containsKey(resultado)) {
				lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
			}
			else {
				lancamentos.put(resultado, 1);
			}
		}
		
		System.out.println("=== COME�ANDO O JOGO ====");
		
		System.out.println("\n VALOR\t" + " - " + " QTD VEZES");
		for (Map.Entry<Integer, Integer> entrada : lancamentos.entrySet()) {
			System.out.printf("%4d %10d\n", entrada.getKey(), entrada.getValue());
		}
	}
}
