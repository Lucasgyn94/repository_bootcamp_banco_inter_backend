package main;

public class Carro {
	
	private String cor;
	private String modelo;
	private int capacidadeTanque;
	
	public Carro() {
		// construtor vazio
	}
	public Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	// getters
	public String getCor() {
		return cor;
	}
	public String getModelo() {
		return modelo;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	//setter
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
	@Override
	public String toString() {
		String 	texto = 	"";
				texto +=	"Cor: " + this.cor + "\n" +
							"Modelo: " + this.modelo + "\n" +
							"Capacidade do Tanque: " + this.capacidadeTanque;
		return texto;
	}
	
}
