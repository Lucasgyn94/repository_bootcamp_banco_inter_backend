package principal;

public class Calculadora implements OperacaoMatematica {
	
	@Override
	public void soma (int op1, int op2) {
		System.out.println("Soma = " + (op1 + op2));
	}
	@Override
	public void subtracao (int op1, int op2) {
		System.out.println("Subtra��o = " + (op1 - op2));
	}
	@Override
	public void multiplicacao (int op1, int op2) {
		System.out.println("Multiplica��o = " + (op1 * op2));
	}
	@Override
	public void divisao (int op1, int op2) {
		System.out.println("Divis�o = " + (op1 / op2));
	}
}
