package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	// setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) {
			return true;
		}
		if (objeto == null || getClass() != objeto.getClass()) {
			return false;
		}
		Bootcamp bootcamp = (Bootcamp) objeto;
		return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.nome, this.descricao, this.dataInicial, this.dataFinal, this.devsInscritos, this.conteudos);
	}
}
