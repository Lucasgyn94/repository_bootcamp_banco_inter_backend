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
			System.out.println("Mês = Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Mês = Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Mês = Março");
				} else {
					if (mes == 4) {
						System.out.println("Mês = Abril");
					} else {
						if (mes == 5) {
							System.out.println("Mês = Maio");
						} else {
							if (mes == 6) {
								System.out.println("Mês = Junho");
							} else {
								if (mes == 7) {
									System.out.println("Mês = Julho");
								} else {
									if (mes == 8 ) {
										System.out.println("Mês = Agosto");
									} else {
										if (mes == 9) {
											System.out.println("Mês = Setembro");
										} else {
											if (mes == 10) {
												System.out.println("Mês = Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Mês = Novembro");
												} else {
													if (mes == 12) {
														System.out.println("Mês = Dezembro");
													} else {
														System.out.println("Digite um número entre 1 e 12.");
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
			System.out.println("Mês = Janeiro");
		} else if (mes == 2) {
			System.out.println("Mês = Fevereiro");
		} else if (mes == 3) {
			System.out.println("Mês = Março");
		} else if (mes == 4) {
			System.out.println("Mês = Abril");
		} else if (mes == 5) {
			System.out.println("Mês = Maio");
		} else if (mes == 6) {
			System.out.println("Mês = Junho");
		} else if (mes == 7) {
			System.out.println("Mês = Julho");
		} else if (mes == 8 ) {
			System.out.println("Mês = Agosto");
		} else if (mes == 9) {
			System.out.println("Mês = Setembro");
		} else if (mes == 10) {
			System.out.println("Mês = Outubro");
		} else if (mes == 11) {
			System.out.println("Mês = Novembro");
		} else if (mes == 12) {
			System.out.println("Mês = Dezembro");
		} else {
				System.out.println("Digite um número entre 1 e 12.");
		}
										
	}
	
	public static void ifFerias(String mes) {
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("Férias");
		}
			
	}
	
	private static void ifMenor() {
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalario) &&(quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcionário deve receber auxílio.");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionário deve receber auxílio");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		if (recebeAuxilio) {
			System.out.println("Funcionário deve receber auxílio.");
		} else {
			System.out.println("Funcionário não deve receber auxílio.");
		}
		
	}
	
	public static void switchSemana(String dia) {
		switch (dia) {
			case "Segunda":
				System.out.println(2);
				break;
			case "Terça":
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
			case "Sábado" :
				System.out.println(7);
			case "Domingo":
				System.out.println(1);
				break;
			default: System.out.println("Digite um dia da semana válido.");
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
			System.out.println("Férias switch");
			break;
		default:
			System.out.println("Més indefinido.");
			break;
		}
	}
}


