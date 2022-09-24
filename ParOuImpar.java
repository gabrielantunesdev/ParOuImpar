package ParOuImpar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int voltar = 0;
		int primeiroJogador = 0;
		int segundoJogador = 0;
		int continuacao = 1;
		String ParOuImpar;
		String ParOuImpar2;
		int escolha = 0;
		int escolha2 = 0;
		int somaDeEscolha;
		String escolhido = null;
		String escolhido2 = null;

		List<String> jogadores = new ArrayList<>();

		jogadores.add("Marcus");
		jogadores.add("Quico");
		jogadores.add("Dami");
		jogadores.add("Dayran");
		jogadores.add("Conrado");
		jogadores.add("Popis");
		jogadores.add("Chaves");

		System.out.println("Lista de Personagens: ");
		System.out.println("1 - Marcus");
		System.out.println("2 - Quico");
		System.out.println("3 - Dami");
		System.out.println("4 - Dayran");
		System.out.println("5 - Conrado");
		System.out.println("6 - Popis");
		System.out.println("7 - Chaves");

		System.out.print("\nQual primeiro personagem que vai participar: ");
		int personagem = leia.nextInt();
		if (personagem == 1) {
			System.out.println("\n" + jogadores.get(0) + " foi primeiro(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido = jogadores.get(0);
		}
		if (personagem == 2) {
			System.out.println("\n" + jogadores.get(1) + " foi primeiro(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido = jogadores.get(1);
		}
		if (personagem == 3) {
			System.out.println("\n" + jogadores.get(2) + " foi primeiro(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido = jogadores.get(2);
		}
		if (personagem == 4) {
			System.out.println("\n" + jogadores.get(3) + " foi primeiro(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido = jogadores.get(3);
		}
		if (personagem == 5) {
			System.out.println("\n" + jogadores.get(4) + " foi primeiro(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido = jogadores.get(4);
		}
		if (personagem == 6) {
			System.out.println("\n" + jogadores.get(5) + " foi primeiro(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido = jogadores.get(5);
		}
		if (personagem == 7) {
			System.out.println("\n" + jogadores.get(6) + " foi primeiro(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido = jogadores.get(6);
		}

		System.out.print("\nQual o segundo personagem que vai participar: ");
		int personagem2 = leia.nextInt();
		if (personagem2 == 1) {
			System.out.println("\n" + jogadores.get(0) + " foi segundo(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido2 = jogadores.get(0);
		}
		if (personagem2 == 2) {
			System.out.println("\n" + jogadores.get(1) + " foi segundo(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido2 = jogadores.get(1);
		}
		if (personagem2 == 3) {
			System.out.println("\n" + jogadores.get(2) + " foi segundo(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido2 = jogadores.get(2);
		}
		if (personagem2 == 4) {
			System.out.println("\n" + jogadores.get(3) + " foi segundo(a)escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido2 = jogadores.get(3);
		}
		if (personagem2 == 5) {
			System.out.println("\n" + jogadores.get(4) + " foi segundo(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido2 = jogadores.get(4);
		}
		if (personagem2 == 6) {
			System.out.println("\n" + jogadores.get(5) + " foi segundo(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido2 = jogadores.get(5);
		}
		if (personagem2 == 7) {
			System.out.println("\n" + jogadores.get(6) + " foi segundo(a) escolhido(a) para a batalha do PAR ou ÍMPAR!");
			escolhido2 = jogadores.get(6);
		}
		do {
		System.out.println("-------------------------------------------");

		System.out.println("\n" + escolhido + " como primeiro(a), pode começar! ");
		System.out.print("Par ou Ímpar? : ");
		ParOuImpar = leia.next();
		
		if(continuacao == 1) {
		if (ParOuImpar.equalsIgnoreCase("Par")) {
			primeiroJogador = 2;
			System.out.print("\nEscolha um número de 0 à 10: ");
			escolha = leia.nextInt();
			if(escolha > 0 && escolha < 11) {
			voltar = 0;
			} else {
				voltar = 1;
				System.out.println("\nEscolha um número de 0 à 10 !");
			}

		} else if (ParOuImpar.equalsIgnoreCase("Ímpar") || ParOuImpar.equalsIgnoreCase("impar")) {
			primeiroJogador = 3;
			System.out.print("\nEscolha um número de 0 à 10: ");
			escolha = leia.nextInt();
			if(escolha > 0 && escolha < 11) {
			voltar = 0;
			} else {
				voltar = 1;
				System.out.println("\nEscolha um número de 0 à 10");
			}
		}
		
		else {
			System.out.println("\nSua escolha foi incorreta!");
			System.out.println("Tente novamente.");
			voltar = 1;
		}
		}
		}while(voltar == 1);
		do {
			System.out.println("-------------------------------------------");
			System.out.println("\n" + escolhido2 + " você é o proximo agora. ");
			System.out.print("Par ou Ímpar? : ");
			ParOuImpar2 = leia.next();
			if(continuacao == 1) {
		    if (ParOuImpar2.equalsIgnoreCase("Par") && !ParOuImpar2.equalsIgnoreCase(ParOuImpar)) {
				segundoJogador = 2;
				System.out.print("\nEscolha um número de 0 à 10: ");
				escolha2 = leia.nextInt();
				if(escolha2 > 0 && escolha2 < 11) {
						
						somaDeEscolha = escolha + escolha2;

						System.out.println("\nO número total foi : " + somaDeEscolha);
						if (somaDeEscolha % 2 == 0) {
							if (primeiroJogador == 2) {
								System.out.println("Ele é PAR, e quem ganhou foi: " + escolhido + "!");
								break;
							} else if (segundoJogador == 2) {
								System.out.println("Ele é PAR, e quem ganhou foi: " + escolhido2 + "!");
								break;
							}
						} else {
							if (primeiroJogador == 3) {
								System.out.println("\nEle é ÍMPAR, e quem ganhou foi: " + escolhido + "!");
								break;
							} else if (segundoJogador == 3) {
								System.out.println("\nEle é ÍMPAR, e quem ganhou foi: " + escolhido2 + "!");
								break;
							}
						}
				} else {
					voltar = 2;
					System.out.println("\nEscolha um número de 0 à 10");
				}
				
			} else if (ParOuImpar2.equalsIgnoreCase("Ímpar")
					|| ParOuImpar2.equalsIgnoreCase("impar") && !ParOuImpar2.equalsIgnoreCase(ParOuImpar)) {

				segundoJogador = 3;
				System.out.print("\nEscolha o número de 0 à 10: ");
				escolha2 = leia.nextInt();

				if(escolha2 > 0 && escolha2 < 11) {
				
				somaDeEscolha = escolha + escolha2;

				System.out.println("\nO número total foi : " + somaDeEscolha);
				if (somaDeEscolha % 2 == 0) {
					if (primeiroJogador == 2) {
						System.out.println("\nEle é PAR, e quem ganhou foi: " + escolhido + "!");
						break;
					} else if (segundoJogador == 2) {
						System.out.println("\nEle é PAR, e quem ganhou foi: " + escolhido2 + "!");
						break;
					}
				} else {
					if (primeiroJogador == 3) {
						System.out.println("\nEle é ÍMPAR, e quem ganhou foi: " + escolhido + "!");
						break;
					} else if (segundoJogador == 3) {
						System.out.println("\nEle é ÍMPAR, e quem ganhou foi: " + escolhido2 + "!");
						break;
					}
				}
				} else { 
					voltar = 2;
					System.out.println("\nEscolha um número de 0 à 10");
				}
			} else if(ParOuImpar2.equals(ParOuImpar)) {
				System.out.println("\nNão se pode escolher PAR & PAR nem ÍMPAR & ÍMPAR! ");
				System.out.println("Tente novamente!");
				voltar = 2;
			}
		    
			else {
				System.out.println("\nSua escolha foi incorreta!");
				System.out.println("Tente novamente.");
				voltar = 2;
			}
		}

		}while(voltar == 2);
		}

}





