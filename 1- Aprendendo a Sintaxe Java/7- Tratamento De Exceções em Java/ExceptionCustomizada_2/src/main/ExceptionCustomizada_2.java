package main;

import javax.swing.JOptionPane;

public class ExceptionCustomizada_2 {

	public static void main(String[] args) {
		int[] numerador = { 4, 5, 8, 10 };
		int[] denominador = { 2, 4, 0, 2, 8 };

		for (int i = 0; i < denominador.length; i++) {
			try {
				if (numerador[i] % 2 != 0) {
					throw new DivisaoNaoExataException("Divis�o n�o exata!", numerador[i], denominador[i]);
				}
				
				int resultado = numerador[i] / denominador[i];
				System.out.println(resultado);
			} catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		
		System.out.println("Continua ....");
	}

}
