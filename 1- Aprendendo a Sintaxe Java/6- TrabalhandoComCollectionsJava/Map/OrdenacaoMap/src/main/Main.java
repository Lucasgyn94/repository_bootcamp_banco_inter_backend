package main;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=== ORDEM ALEATORIA ===");
		
		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put(" Hawking, Sthepen", new Livro("Uma breve hist�ria do tempo", 286));
				put(" Dunigg, Charles", new Livro("O poder do h�bito", 406));
				put(" Harari, Yuval Noah", new Livro("21 Li��es para o seculo 21", 150));
			}
		};
		
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n=== ORDEM DE INSERCAO ===");
		
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {
			{
				put(" Hawking, Sthepen", new Livro("Uma breve hist�ria do tempo", 286));
				put(" Dunigg, Charles", new Livro("O poder do h�bito", 406));
				put(" Harari, Yuval Noah", new Livro("21 Li��es para o seculo 21", 150));
			}
		};
		
		for (Map.Entry<String, Livro> livro2 : meusLivros2.entrySet()) {
			System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
		}
		
		// em ordem alfab�tica dos autores
		System.out.println("\n===ORDEM ALFAB�TICA DOS AUTORES===");
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
		
		for (Map.Entry<String, Livro> livro3 : meusLivros3.entrySet()) {
			System.out.println(livro3.getKey() + " - " + livro3.getValue().getNome());
		}
		
		// em ordem alfabetica dos nomes dos livros
		System.out.println("\n===ORDEM DOS NOMES DOS LIVROS===");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
		meusLivros4.addAll(meusLivros.entrySet());
		
		for (Map.Entry<String, Livro> livro4 : meusLivros4) {
			System.out.println(livro4.getKey() + " - " + livro4.getValue().getNome());
		}
		
		// em ordem de paginas
		System.out.println("\n===ORDEM DAS PAGINAS===");
		Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginas());
		meusLivros5.addAll(meusLivros.entrySet());
		
		for (Map.Entry<String, Livro> livro5 : meusLivros5) {
			System.out.println(livro5.getKey() + " - " + livro5.getValue().getNome());
		}
		
		
		
	}
}
