package desafios.estruturasDeRepeticao;

import java.util.Scanner;

public class NomeIdade {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while (true) {
			System.out.println("Digite o seu nome");
			nome = entrada.next();
			
			if (nome.equals("0")) {
				break;
			}
			
			System.out.println("Digite a sua idade");
			idade = entrada.nextInt();
			
		}
		entrada.close();
		System.out.println("Fim");
	}

}
