package desafio02;

public class RodarAplicacao {
	
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		
		//upcast implicitos
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		gerente.metodo1();
		vendedor.metodo1();
		faxineiro.metodo1();
		
		// downcast explicito
		//Vendedor vendedor_ = (Vendedor) new Funcionario();
	}
}
