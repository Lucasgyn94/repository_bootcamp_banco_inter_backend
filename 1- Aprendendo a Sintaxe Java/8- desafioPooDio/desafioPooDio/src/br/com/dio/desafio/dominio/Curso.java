package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() {
	// construtor vazio
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		String s = 	"";
				s+= "============================\n";
				s+=	"T�tulo: " + this.getTitulo() + "\n" +
					"Descricao: " + this.getDescricao() + "\n" +
					"Carga hor�ria: " + this.cargaHoraria + "\n";
				s+= "============================";
		return s;
	}
	
}
