package main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso c1 = new Curso();
		c1.setTitulo("Curso de Java");
		c1.setDescricao("Descri��o curso java");
		c1.setCargaHoraria(8);
		
		Curso c2 = new Curso();
		c2.setTitulo("Curso de JavaScript");
		c2.setDescricao("Descri��o curso java");
		c2.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("\n=== MENTORIA DE JAVA ===");
		mentoria.setDescricao("Descri��o da mentoria");
		mentoria.setLocalDate(LocalDate.now());
		
		Bootcamp b1 = new Bootcamp();
		b1.setNome("\nBootcamp de Java Developer");
		b1.setDescricao("Descri��o Bootcamp Java Developer");
		b1.getConteudos().add(c1);
		b1.getConteudos().add(c2);
		b1.getConteudos().add(mentoria);
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(b1);
		System.out.println("\n=== CONTE�DOS INSCRITOS ==== ");
		System.out.println(devLucas.getConteudosInscritos());
		devLucas.progredir();
		devLucas.progredir();
		System.out.println("\n-----------------------------------");
		System.out.println("\n=== CONTEUDOS INSCRITOS LUCAS === ");
		System.out.println(devLucas.getConteudosInscritos());
		System.out.println("\n=== CONTEUDOS CONCLUIDOS LUCAS === ");
		System.out.println(devLucas.getConteudosConcluidos());
		System.out.println("XP: " + devLucas.calcularTotalXp());
		/*
		Dev devTampinha = new Dev();
		devTampinha.setNome("Tampinha");
		devTampinha.inscreverBootcamp(b1);
		System.out.println("\nConte�dos Inscritos de Tampinha: " + devTampinha.getConteudosInscritos());
		devTampinha.progredir();
		devTampinha.progredir();
		devTampinha.progredir();
		System.out.println("\n--------------------------");
		System.out.println("\nConte�dos Inscritos Tampinha: "  + devTampinha.getConteudosInscritos());
		System.out.println("\nConte�dos Concluidos Tampinha: "  + devTampinha.getConteudosConcluidos());
		System.out.println("XP: " + devTampinha.calcularTotalXp());
		System.out.println("===============================");
		*/
	}

}
