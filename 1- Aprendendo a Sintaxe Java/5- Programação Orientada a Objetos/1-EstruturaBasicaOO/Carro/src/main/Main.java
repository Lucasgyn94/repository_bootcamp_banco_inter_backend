package main;

public class Main {

	public static void main(String[] args) {
		Carro car1 = new Carro();
		car1.setCor("Black");
		car1.setModelo("Toyota Corolla 2023");
		car1.setCapacidadeTanque(65);
		
		System.out.println("Cor: " + car1.getCor());
		System.out.println("Modelo: " + car1.getModelo());
		System.out.println("Capacidade Tanque" + car1.getCapacidadeTanque());
		System.out.println("Valor para encher o tanque: R$ " + car1.totalValorTanque(3.59) + " reais.");
	}

}
