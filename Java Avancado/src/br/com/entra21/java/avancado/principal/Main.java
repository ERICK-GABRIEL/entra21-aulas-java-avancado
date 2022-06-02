package br.com.entra21.java.avancado.principal;

import java.util.Scanner;

import br.com.entra21.java.avancado.principal.aula01.enums.PersonagemJogo;
import br.com.entra21.java.avancado.principal.aula02.collections.list.AprenderCollections;

public class Main {
	static Scanner entrada = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {

		byte opcao;

		do {

			System.out.println(exibirMenu());
			opcao = entrada.nextByte();

			switch (opcao) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderWrapper();
				break;

			case 2:
				aprenderEnum();
				break;

			case 3:
				AprenderCollections.aprender();
				break;

			default:
				System.out.println("Por favor digite uma opção válida!");
				break;
			}

		} while (opcao != 0);

	}

	public static String exibirMenu() {

		String menu = "\nVamos aprender sobre conceitos avançados sobre JAVA!";
		menu += "\n\nEscolha uma das opções abaixo:";
		menu += "\n0 - Sair";
		menu += "\n1 - Wrapper";
		menu += "\n2 - ENUM";
		menu += "\n3 - Collections List";
		return menu;

	}

	public static void aprenderWrapper() {

		char letra = Character.valueOf('C');
		boolean verdade = Boolean.parseBoolean("True");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("128");
		int inteiroTres = Integer.parseInt("10000");
		long inteiroQuatro = Long.parseLong("100000");

		float decimalUm = Float.parseFloat("1000.10");
		double decimalDois = Double.parseDouble("2000.20 ");

	}

	public static void aprenderEnum() {

		System.out.println("Testando enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje ? "sim" : "nao");

		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + "" + DiasSemana.values()[dia]);
		}
		System.out.println("Gosto desse tipo de personagem: " + PersonagemJogo.ANAO);
		System.out.println("Geralmente a classe " + PersonagemJogo.ANAO + " tem HP = " + PersonagemJogo.ANAO.getVIDA());
		System.out.println("Geralmente a classe do " + PersonagemJogo.ANAO + " a caracteristica mais comum dele é "
				+ PersonagemJogo.ANAO.getDESCRICAO());
		System.out.println("Veja a descrição completa do " + PersonagemJogo.MAGO + ": A sua habilidade principal é "
				+ PersonagemJogo.MAGO.getDESCRICAO() + " E a sua vida é " + PersonagemJogo.MAGO.getVIDA() + " HP!");
		System.out.println(PersonagemJogo.BARBARO.getDetails());

		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {

			System.out.println(
					"Contador = " + personagem + " posição do Enum = " + PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println("Tem " + PersonagemJogo.values()[personagem].getVIDA() + " de HP!");
			System.out.println("Sua descrição é " + PersonagemJogo.values()[personagem].getDESCRICAO());
			System.out.println("---------------------------------------------------");

		}

		for (PersonagemJogo variavel : PersonagemJogo.values()) {
			System.out.println(variavel.ordinal() + " - " + variavel.getDetails());
			System.out.println("O Druida esta na posição: " + PersonagemJogo.DRUIDA.ordinal());
		}
	}

}
