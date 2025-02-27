package exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	/*
	 /*
		Crie um conjunto contendo as cores do arco-�ris e:
		a) Exiba todas as cores o arco-�ris uma abaixo da outra;
		b) A quantidade de cores que o arco-�ris tem;
		c) Exiba as cores em ordem alfab�tica;
		d) Exiba as cores na ordem inversa da que foi o climat�rico;
		e) Exiba todas as cores que come�am com a letra �v�;
		f) Remo��o de todas as cores que n�o comecem com a letra �v�;
		g) Limpe o conjunto;
		h) Confira se o conjunto est� vazio;
	 
	 * */
	public static void main(String[] args) {
		
		Set<String> coresDoArcoIris = new HashSet<>(Arrays.asList("Anil", "Violeta", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
		
		// 		a) Exiba todas as cores o arco-�ris uma abaixo da outra;

		System.out.println("=== CORES DO ARCO-IRIS ===");
		for (String cores : coresDoArcoIris ) {
			System.out.println(cores.toString());
		}
		
		// 		b) A quantidade de cores que o arco-�ris tem;
		System.out.println("Quantidade de cores = " + coresDoArcoIris.size());
		
		//		c) Exiba as cores em ordem alfab�tica;
		System.out.println("=== CORES EM ORDEM ALFAB�TICA ===");
		Set<String> coresDoArcoIris2 = new TreeSet<>(coresDoArcoIris);
		coresDoArcoIris2.forEach(cores -> System.out.println(cores.toString()));
	
		//		d) Exiba as cores na ordem inversa da que foi o climat�rico;
		System.out.println("CORES DO ARCO-IRIS REVERSA");
		Set<String> coresDoArcoIris3 = new LinkedHashSet<>(Arrays.asList("Anil", "Violeta", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
		List<String> coresArcoIrisList = new ArrayList<>(coresDoArcoIris3);
		Collections.reverse(coresArcoIrisList);
		System.out.println(coresArcoIrisList.toString());
		
		//		e) Exiba todas as cores que come�am com a letra �v�;
		System.out.println("== CORES COM A LETRA V ===");
		
		for (String cor :  coresDoArcoIris) {
			if (cor.startsWith("V")) {
				System.out.println(cor.toString());
			}
		}
        
		//		f) Remo��o de todas as cores que n�o comecem com a letra �v�;
		System.out.println("Lista antes da remo��o das cores com a letra v");
		System.out.println(coresDoArcoIris.toString());
		Iterator<String> iterator = coresDoArcoIris.iterator();
		while (iterator.hasNext()) {
			if (!iterator.next().startsWith("V")) {
				iterator.remove();
			}
		}
		System.out.println("Lista ap�s a remo��o das cores que n�o come��o com a letra v");
		System.out.println(coresDoArcoIris.toString());
		
		//		g) Limpe o conjunto;
		coresDoArcoIris.clear();
		//		h) Confira se o conjunto est� vazio;
		System.out.println("Conjunto vazio = " + coresDoArcoIris.isEmpty());
		
	}

}
