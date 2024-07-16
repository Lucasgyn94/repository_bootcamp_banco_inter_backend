package Principal;

import java.util.Date;

public class Adicao {
	public static void main(String[] args) {
		
		String concatenacao = "?";
		
		concatenacao = 1 + 1 + 1 + "1";
		System.out.println(concatenacao);
		
		concatenacao = 1 + "1" + 1 + 1;
		System.out.println(concatenacao);
		
		concatenacao = "1" + 1 + 1 + 1;
		System.out.println(concatenacao);
		
		concatenacao = "1" + (1 + 1 + 1);
		System.out.println(concatenacao);
		
		concatenacao = (1 + 1 + 1) + "1";
		System.out.println(concatenacao);
	}
}
