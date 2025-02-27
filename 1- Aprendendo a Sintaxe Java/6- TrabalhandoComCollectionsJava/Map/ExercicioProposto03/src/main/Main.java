package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informa��es  de id e contato, crie um dicion�rio e
ordene este dicion�rio exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class Main {
	public static void main(String[] args) {
		System.out.println("===\t ORDEM ALEAT�RIA \t===");
		Map<Integer, Contato> minhaAgenda = new HashMap<>() {
			{
				put(1, new Contato("Lucas", 99998888));
				put(2, new Contato("Tampinha", 77776666));
				put(3, new Contato("Zeca", 66665555));
			}
		};
		
		System.out.println(minhaAgenda.toString());
		
		//Exibindo em ordem aleatoria
		System.out.println("\n=== ORDEM ALE�TORIA ===");
		for (Map.Entry<Integer, Contato> contato : minhaAgenda.entrySet()) {
			System.out.println("Chave = " + contato.getKey() + " - " + "Nome = "+ contato.getValue().getNome());
		}
		
		// exibindo em ordem de inser��o
		System.out.println("=== ORDEM DE INSER��O ===");
		Map<Integer, Contato> minhaAgenda2 = new LinkedHashMap<>() {
			{
				put(1, new Contato("Lucas", 99998888));
				put(2, new Contato("Tampinha", 77776666));
				put(3, new Contato("Zeca", 66665555));
			}
		};
		
		for (Map.Entry<Integer, Contato> contato : minhaAgenda2.entrySet()) {
			System.out.println("Chave = " + contato.getKey() + " - " + "Nome = " + contato.getValue().getNome());
		}
		
		// ORDEM ID
		System.out.println("\n=== ORDEM ID ====");
		Map<Integer, Contato> minhaAgenda3 = new TreeMap<>(minhaAgenda2);
		for (Map.Entry<Integer, Contato> contato : minhaAgenda3.entrySet()) {
			System.out.println("Chave = " + contato.getKey() + " - " + "Nome = " + contato.getValue().getNome());
			
		}
		
		// ordem numero telefone
		System.out.println("\n=== ORDEM DE TELEFONE ===");
		Set<Map.Entry<Integer, Contato>> organizaValores = new TreeSet<>(new ComparatorOrdemNumerica());
		organizaValores.addAll(minhaAgenda.entrySet());
		
		for (Map.Entry<Integer, Contato> entrada : organizaValores) {
			System.out.println(entrada.getKey() + " - " + entrada.getValue().getNumero() + " - " + entrada.getValue().getNome());
		}
		
		// ORDENR NOME CONTATO
		System.out.println("\n=== ORDEM DE NOME ===");
		Set<Map.Entry<Integer, Contato>> organizaValores2 = new TreeSet<>(new ComparatorOrdemNome());
		organizaValores2.addAll(minhaAgenda.entrySet());
		
		for (Map.Entry<Integer, Contato> contato : organizaValores2) {
			System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
		}
	}
}
