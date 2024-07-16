package refatoracaoOrdenacaoMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

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
		/*
		Set<Map.Entry<Integer, Contato>> organizaValores = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>> () {
			@Override
			public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
				return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
			}
		});
		*/
	
		// organizando valores com classe anonima
		/*
		Set<Map.Entry<Integer, Contato>> organizaValores = new TreeSet<>(Comparator.comparing(
        new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));
        */
		
		// organizando valores com lambda
		
		Set<Map.Entry<Integer, Contato>> organizaValores = new TreeSet<>(Comparator.comparing(
			cont -> cont.getValue().getNumero()
        ));
		
		organizaValores.addAll(minhaAgenda.entrySet());
		
		for (Map.Entry<Integer, Contato> entrada : organizaValores) {
			System.out.println(entrada.getKey() + " - " + entrada.getValue().getNumero() + " - " + entrada.getValue().getNome());
		}
		
		// ORDENR NOME CONTATO
		System.out.println("\n=== ORDEM DE NOME ===");
		/*
		Set<Map.Entry<Integer, Contato>> organizaValores2 = new TreeSet<>(new ComparatorOrdemNome());
		*/
		Set<Map.Entry<Integer, Contato>> organizaValores2 = new TreeSet<>(Comparator.comparing(
			cont2 -> cont2.getValue().getNome()
		));
		organizaValores2.addAll(minhaAgenda.entrySet());
		
		for (Map.Entry<Integer, Contato> contato : organizaValores2) {
			System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
		}
		

	}
}
