package main;

public class Calculadora {
	
	public static void soma(int num1, int num2) {
		int resultado = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + resultado);
	}
	
	public static void subtracao (int num1, int num2) {
		int resultado = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + resultado);
	}
	
	public static void multiplicacao (int num1, int num2) {
		int resultado = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + resultado);
	}
	
	public static void divisao (int num1, int num2) {
		int resultado = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + resultado);
	}

}
