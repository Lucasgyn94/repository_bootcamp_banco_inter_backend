import java.util.Scanner;

public class MinhaClasse {
	
	public static void main(String [] args) {
		String meuNome = "Lucas";
		int idade = 28;
		boolean verdade;
		verdade = true;
		
		System.out.println("Nome: " + meuNome + ". Idade = " + idade + ". Verdade = " + verdade);
		
		System.out.println(nomeCompleto());
	}
	
	public static String nomeCompleto () {
		Scanner entrada = new Scanner(System.in);
		String nomeComplet;
		String primeiroNome; 
		String segundoNome;
		
		System.out.println("Digite o seu primeiro nome: ");
		primeiroNome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		segundoNome = entrada.nextLine();
		
		entrada.close();
		
		return primeiroNome.concat(" ").concat(segundoNome);
		
		
	}
	
}