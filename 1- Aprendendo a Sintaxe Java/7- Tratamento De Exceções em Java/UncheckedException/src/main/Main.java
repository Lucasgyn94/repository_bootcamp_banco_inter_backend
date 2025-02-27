package main;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		boolean continuaLaco = true;
		
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println("Resultado = " + resultado);
				continuaLaco = false;
			} catch (NumberFormatException e) {
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Entrada inv�lida, informe um inteiro.");
			} catch (ArithmeticException e) {
				JOptionPane.showConfirmDialog(null, "Imposs�vel dividir por 0");
			} finally {
				System.out.println("Chegou no finally");
			}
		} while(continuaLaco);
		
		System.out.println("Fim do c�digo");
		
	}
	
	public static int dividir (int a, int b) { return a / b; }
}
