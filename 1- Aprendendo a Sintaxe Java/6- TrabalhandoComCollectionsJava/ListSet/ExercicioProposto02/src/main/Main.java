package main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e fa�a um programa que ordene esse conjunto por:
a) Ordem de inser��o;
b) Ordem natural(nome);
c) IDE;
d) Ano de cria��o e nome;
e) Nome, ano de cria��o e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Main {
	public static void main(String[] args) {
		Set<LinguagemFavorita> minhasLinguagens  = new HashSet<>();
		minhasLinguagens.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		minhasLinguagens.add(new LinguagemFavorita("Python", 1991 , "Pycharm"));
		minhasLinguagens.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
		
		// a) Ordem de inser��o;
		System.out.println("=== ORDEM DE INSER��O ===");
		minhasLinguagens.forEach(linguagens -> System.out.println(linguagens.toString()));
		
		// b) Ordem natural(nome);
		System.out.println("=== ORDEM NATURAL ===");
		Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<LinguagemFavorita>(minhasLinguagens);
	    for (LinguagemFavorita linguagem : minhasLinguagens2) System.out.println(linguagem);
	    //c) IDE;
	    
	    System.out.println("=== ORDEM IDE ==="); 
	    Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
	    minhasLinguagens3.addAll(minhasLinguagens);
	    minhasLinguagens3.forEach(lang -> System.out.println(lang.toString()));
	    
	    // d) Ano de cria��o e nome;
	    
	    System.out.println("=== ORDEM ANO DE CRIA��O E NOME ===");
	    Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
	    minhasLinguagens4.addAll(minhasLinguagens);
	    minhasLinguagens4.forEach(lang -> System.out.println(lang.toString()));
	    
	    // //e) Nome, ano de cria��o e IDE;
	    System.out.println("=== ORDEM NOME - ANO - IDE");
	    Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
	    minhasLinguagens5.addAll(minhasLinguagens);
	    minhasLinguagens5.forEach(lang -> System.out.println(lang.toString()));
	}
}
