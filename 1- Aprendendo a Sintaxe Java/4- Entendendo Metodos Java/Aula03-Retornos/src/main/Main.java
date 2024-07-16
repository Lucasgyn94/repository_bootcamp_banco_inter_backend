package main;

public class Main {
	public static void main(String[] args) {
		// Retornos
		System.out.println("RETORNOS");
		System.out.println("=========================");
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Área do quadrado:" + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5,5);
		System.out.println("Área do retângulo:" + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7,8,9);
		System.out.println("Área do trapézio:" + areaTrapezio);
		System.out.println("============================");
	}
}
