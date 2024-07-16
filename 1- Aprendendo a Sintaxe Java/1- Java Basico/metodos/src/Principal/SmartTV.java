package Principal;

public class SmartTV {
	
	private boolean ligada;
	private int canal = 1;
	private int volume = 25;
	
	// metodo construtor
	public SmartTV() {
		// construtor vazio
	}
	public SmartTV(boolean ligada, int canal, int volume) {
		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;
	}
	
	// getters
	public boolean getLigada()	{
		return this.ligada;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getVolume() {
		return volume;
	}
	
	// setters
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//funções
	public void ligarTv() {
		this.ligada = true;
		System.out.println("Smart TV ligada com sucesso!");
	}
	public void desligarTv() {
		this.ligada = false;
		System.out.println("Smart TV desligada com sucesso!");
	}
	public void aumentarVolume() {
		this.volume = this.volume + 1;
		System.out.println("Aumentando o volume para " + volume);
	}
	public void abaixarVolume() {
		this.volume = this.volume - 1;
		System.out.println("Abaixando o volume para " + volume);
	}
	public void aumentarCanal() {
		this.canal++;
		System.out.println("Indo para o canal " + canal);
	}
	public void diminuirCanal() {
		this.canal = this.canal - 1;
	}
	public void mudarCanal(int novoCanal) {
		this.canal = novoCanal;
		System.out.println("Indo para o canal " + canal);;
	}
	
	@Override
	public String toString() {
		String 	texto = 	"";
				texto += 	"Ligada: " + this.ligada + "\n" +
							"Canal: " + this.canal +
							"Volume: " + this.volume;
		return texto;
	}
}
