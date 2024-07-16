package mainExercicioStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioStream {
	public static void main(String[] args) {
		List<String> numerosAleatorios =
				Arrays.asList("1", "0","4", "1", "2", "3","9","9","6","5");
	
		System.out.println("=== Elementos da lista de String ===");
		
		numerosAleatorios.stream().forEach(System.out::println);
		
		// 5 primeiros n�meros e coloque dentro de um set
		System.out.println("=== 5 PRIMEIROS N�MEROS DENTRO DE UM SET ===");
		numerosAleatorios.stream()
			.limit(5)
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		// Transformar lista de string em lista de numeros inteiros
		System.out.println("\n=== TRANSFORMANDO LISTA DE STRING PARA INTEIROS ===");
		/*
		numerosAleatorios.stream()
		.map(Integer::parseInt)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		;
		*/
		List<Integer> collectList = numerosAleatorios.stream()
			.map(Integer::parseInt)
			.collect(Collectors.toList());
		
		System.out.println(collectList.toString());
		// numeros pares e maiores que 2 e coloque em uma lista
		System.out.println("=== NUMEROS PARES ===");
		List<String> numerosAleatorios2 =
				Arrays.asList("1", "0","4", "1", "2", "3","9","9","6","5");
		/*
		List<Integer> listParesMaioresQue2 = numerosAleatorios2.stream()
				.map(Integer::parseInt)
				.filter(new Predicate<Integer> () {
					@Override
					public boolean test (Integer i) {
						if (i % 2 == 0 && i > 2) {
							return true;
						} else {
							return false;
						}
						
					}
				}).collect(Collectors.toList());
		
		*/
		List<Integer> listParesMaioresQue2 = numerosAleatorios2.stream()
			.map(Integer::parseInt)
			.filter(i -> (i % 2 == 0 && i > 2))
			.collect(Collectors.toList());
		
		System.out.println(listParesMaioresQue2);
		
		// media dos numeros
		System.out.println("=== MEDIA DOS N�MEROS ===");
		/*
		numerosAleatorios.stream()
			.mapToInt(new ToIntFunction<String>() {
				@Override
				public int applyAsInt(String s) {
					return Integer.parseInt(s);
				}
			});
		*/
		/*
		numerosAleatorios.stream()
			.mapToInt(Integer::parseInt)
			.average()
			.ifPresent(new DoubleConsumer() {
				@Override
				public void accept(double v) {
					System.out.println(v);
				}
			});
		
			;
			*/
		numerosAleatorios.stream()
			.mapToInt(Integer::parseInt)
			.average()
			.ifPresent(System.out::println); // ifPresent = Se um valor estiver presente, executa a a��o dada com o valor, caso contr�rio, n�o faz nada.

		//remover os numeros impares
		System.out.println("=== REMOVE IMPARES ===");
		List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
		System.out.println(numerosAleatoriosInteger);
		
		
		/*
		numerosAleatoriosInteger.removeIf(new Predicate<Integer> () {
			@Override
			public boolean test (Integer integer) {
				if (integer % 2 != 0) {
					return true;
				} else {
					return false;
				}
			}
		});
		*/
		// ignorar os 3 primeiros elementos da lista
		System.out.println("\n=== IGNORANDO 3 PRIMEIROS ELEMENTOS ===");
		List<Integer> numerosAleatoriosInteger2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
		
		numerosAleatorios2.stream()
			.skip(3)
			.forEach(System.out::println);
		
		// retirando repetidos da lsta
		System.out.println("\n=== N�MEROS �NICOS ===");
		long numerosUnicos = numerosAleatoriosInteger.stream()
				.distinct()
				.count();
		System.out.println(numerosUnicos);
		
		// menor valor
		System.out.println("\n=== MENOR VALOR ===");
		numerosAleatorios2.stream()
			.mapToInt(Integer:: parseInt)
			.min()
			.ifPresent(System.out::println);
		
		// maior valor
		System.out.println("\n === MAIOR VALOR ===");
		numerosAleatorios2.stream()
			.mapToDouble(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);
		
		// soma dos pares
		System.out.println("\n=== SOMA DOS PARES ===");
		int somaDosPares = numerosAleatoriosInteger.stream()
				.filter(i -> (i % 2 == 0))
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Soma = " + somaDosPares);
		// lista em ordem n�meros
		System.out.println("\n=== LISTA EM ORDEM N�MERICA ===");
		List<Integer> numerosOrdemNatural = numerosAleatoriosInteger2.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);
        
        // agrupe os valores multiplos de 3 ou 5
        System.out.println("\n=== M�LTIPLOS DE 3 E 5 ===");
        
        Map<Boolean, List<Integer>> multiplos3e5 = numerosAleatoriosInteger.stream()
        	.collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(multiplos3e5);
       
		//.out.println();
	}
}
