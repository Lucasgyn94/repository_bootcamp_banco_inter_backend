package principal;

public class Desafio01 {
	public static void main(String[] args) {
		ifFlecha(0);
		ifSemFlecha(7);
		ifFerias("JULHO");
		ifMenor();
		switchSemana("Segunda");
		switchNumero(3);
		switchFerias("julho");
	}
	
	public static void ifFlecha(int mes) {
		if (mes == 1) {
			System.out.println("M�s = Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("M�s = Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("M�s = Mar�o");
				} else {
					if (mes == 4) {
						System.out.println("M�s = Abril");
					} else {
						if (mes == 5) {
							System.out.println("M�s = Maio");
						} else {
							if (mes == 6) {
								System.out.println("M�s = Junho");
							} else {
								if (mes == 7) {
									System.out.println("M�s = Julho");
								} else {
									if (mes == 8 ) {
										System.out.println("M�s = Agosto");
									} else {
										if (mes == 9) {
											System.out.println("M�s = Setembro");
										} else {
											if (mes == 10) {
												System.out.println("M�s = Outubro");
											} else {
												if (mes == 11) {
													System.out.println("M�s = Novembro");
												} else {
													if (mes == 12) {
														System.out.println("M�s = Dezembro");
													} else {
														System.out.println("Digite um n�mero entre 1 e 12.");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public static void ifSemFlecha(int mes) {
		if (mes == 1) {
			System.out.println("M�s = Janeiro");
		} else if (mes == 2) {
			System.out.println("M�s = Fevereiro");
		} else if (mes == 3) {
			System.out.println("M�s = Mar�o");
		} else if (mes == 4) {
			System.out.println("M�s = Abril");
		} else if (mes == 5) {
			System.out.println("M�s = Maio");
		} else if (mes == 6) {
			System.out.println("M�s = Junho");
		} else if (mes == 7) {
			System.out.println("M�s = Julho");
		} else if (mes == 8 ) {
			System.out.println("M�s = Agosto");
		} else if (mes == 9) {
			System.out.println("M�s = Setembro");
		} else if (mes == 10) {
			System.out.println("M�s = Outubro");
		} else if (mes == 11) {
			System.out.println("M�s = Novembro");
		} else if (mes == 12) {
			System.out.println("M�s = Dezembro");
		} else {
				System.out.println("Digite um n�mero entre 1 e 12.");
		}
										
	}
	
	public static void ifFerias(String mes) {
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("F�rias");
		}
			
	}
	
	private static void ifMenor() {
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalario) &&(quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcion�rio deve receber aux�lio");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		if (recebeAuxilio) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		} else {
			System.out.println("Funcion�rio n�o deve receber aux�lio.");
		}
		
	}
	
	public static void switchSemana(String dia) {
		switch (dia) {
			case "Segunda":
				System.out.println(2);
				break;
			case "Ter�a":
				System.out.println(3);
				break;
			case "Quarta":
				System.out.println(4);
				break;
			case "Quinta":
				System.out.println(5);
				break;
			case "Sexta":
				System.out.println(6);
				break;
			case "S�bado" :
				System.out.println(7);
			case "Domingo":
				System.out.println(1);
				break;
			default: System.out.println("Digite um dia da semana v�lido.");
				break;
		}
	}
	
	public static void switchNumero(int numero) {
		switch (numero) {
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		case 5:
			System.out.println("Talves");
			break;
		default:
			System.out.println("Valor indefinido");
			break;
		}
	}
	
	public static void switchFerias(String mes) {
		switch(mes) {
		case "julho":
		case "dezembro":
		case "janeiro":
			System.out.println("F�rias switch");
			break;
		default:
			System.out.println("M�s indefinido.");
			break;
		}
	}
}


