package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("");
		Calculadora calculadora = new Calculadora();
		calculadora.soma(2, 2);
		calculadora.subtracao(4, 2);
		calculadora.multiplicacao(5, 5);
		calculadora.divisao(10, 2);
		
		System.out.println("=====================");
		System.out.println("EMPRESTIMO");
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.calcular(1000, emprestimo.getDuasParcelas());
	    emprestimo.calcular(1000, emprestimo.getTresParcelas());
	    emprestimo.calcular(1000, 5);
	    
	    System.out.println("=====================");
		System.out.println("MENSAGEM");
		Mensagem mensagem = new Mensagem();
		mensagem.obterMensagem(9);
		mensagem.obterMensagem(15);
		mensagem.obterMensagem(2);
	    
		
		

	}

}
