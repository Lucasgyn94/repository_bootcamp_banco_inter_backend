package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public Mentoria () {
		// construtor vazio
	}
	
	public LocalDate getLocalDate() {
		return data;
	}
	
	public void setLocalDate(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		String s = 	"";
		s+= "==========================\n";
		s+=	"T�tulo: " + this.getTitulo() + "\n" +
			"Descricao: " + this.getDescricao() + "\n" +
			"Data: " + this.data;
		s+= "\n=============================";
		return s;
	}
}
