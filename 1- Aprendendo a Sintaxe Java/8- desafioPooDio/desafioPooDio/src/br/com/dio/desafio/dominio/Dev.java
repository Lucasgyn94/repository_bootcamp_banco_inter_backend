package br.com.dio.desafio.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream()
			.findFirst();
		
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.out.println("Você não está matriculado em nenhum bootcamp!");
		}
	}
	
	public double calcularTotalXp() {
		Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
		double soma = 0;
		
		while(iterator.hasNext()) {
			double next = iterator.next().calcularXp();
			soma += next;
		}
		return soma;
	}
	
	// getters
	public String getNome() {
		return nome;
	}
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	
	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) {
			return true;
		}
		if (objeto == null || getClass() != objeto.getClass()) {
			return false;
		}
		Dev dev = (Dev) objeto;
		return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
	}
}
