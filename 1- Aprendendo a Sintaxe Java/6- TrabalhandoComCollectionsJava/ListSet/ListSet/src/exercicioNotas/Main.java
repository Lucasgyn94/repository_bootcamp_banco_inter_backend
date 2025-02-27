package exercicioNotas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//hash set = conjunto de hash
		// arrays = matrizes ; asList = como lista
		System.out.println("Criando um conjunto e adicionando notas: ");
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6, 8.5));
		System.out.println(notas.toString());
		
		// confira se a nota 5.0 est� no conjunto
		System.out.println("Conferindo a nota 5 no conjunto: " + notas.contains(5d));
		
		// exibindo a menor nota
		System.out.println("Menor nota = " + Collections.min(notas));
		// exibindo a maior nota
		System.out.println("Maior nota = " + Collections.max(notas));
		// exibindo a soma dos valores
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		
		while (iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Soma dos valores = " + soma);
		
		// exibindo a m�dia das notas
		
		System.out.println("M�dia = " + soma / notas.size());
		
		// removendo a nota 0
		System.out.println("Lista antes da remo��o da nota 0");
		System.out.println(notas.toString());
		notas.remove(0d);
		System.out.println("Lista ap�s remo��o da nota 0");
		System.out.println(notas.toString());
		
		// Removendo as notas menores que 7
		Iterator<Double> iterator1 = notas.iterator();
		
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) {
				iterator1.remove();
			}
		}
		
		System.out.println("Lista ap�s remo��o das notas menores que 7");
		System.out.println(notas.toString());
		
		System.out.println("Criando notas 2");
		Set<Double> notas2 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas2.toString());
		
		System.out.println("Colocando notas em ordem crescente" );
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3.toString());
		
		// apagando um conjunto
		System.out.println("Conjunto notas antes da remo��o");
		System.out.println(notas.toString());
		notas.clear();
		
		// verificando se o conjunto de notas foi apagado
		System.out.println("Notas apagadas = " + notas.isEmpty());
		
	}
	
}
