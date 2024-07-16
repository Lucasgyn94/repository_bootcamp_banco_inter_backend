package main;

import java.util.Objects;

public class Contato {
	private String nome;
	private Integer numero;
	
	public Contato () {
		// construtor vazio
	}
	public Contato(String nome, Integer numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public Integer getNumero() {
		return numero;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) {
			return true;
		}
		if (objeto == null || getClass() != objeto.getClass()) {
			return false;
		}
		Contato contato = (Contato) objeto;
		return this.nome.equals(contato.getNome()) && this.numero.equals(contato.numero); 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}
	
	@Override
	public String toString() {
		String 	s = "";
				s+= " Nome: " + this.nome + "\n" +
					" Numero: " + this.numero + "\n";
		return s;
	}
}
