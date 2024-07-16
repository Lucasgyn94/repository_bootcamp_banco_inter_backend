package Principal;

public class TiposVariaveis {
	
	public static void main(String[] args) {
		
		String meuNome = "Lucas Ferreira da Silva";
		double salarioMinimo = 1200;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto; // numeroNormal = 1
		short numeroCurto2 = (short) numeroNormal; // casting.  O cast é uma conversão, é quando convertemos um valor de um tipo para outro tipo. 	
		
		System.out.println(numeroCurto2);
	}

}
