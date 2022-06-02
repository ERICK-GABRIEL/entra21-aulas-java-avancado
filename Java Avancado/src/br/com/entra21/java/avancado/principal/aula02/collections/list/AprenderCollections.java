package br.com.entra21.java.avancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {
	static Scanner entrada = new Scanner(System.in);

	public static void aprender() {

		byte opcao;

		do {
			System.out.println(exibirMenu2());
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Volte sempre quando quiser aprender Collections - List!");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}

		} while (opcao != 0);

	}

	public static String exibirMenu2() {

		String menu2 = "------------------------------------------\n";
		menu2 += "Escolha uma das opções sobre Collections:";
		menu2 += "\n0 - Retornar ao menu inicial";
		menu2 += "\n1 - Aprender ArrayList ";
		menu2 += "\n2 - Aprender LinkedList ";

		return menu2;

	}

	private static void aprenderArrayList() {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Erick");
		nomes.add("Oliota");
		nomes.add("Maria");
		nomes.add(0, "Primeiro");
		System.out.println("Quantos nomes? " + nomes.size() + " nomes");
		for (String item : nomes) {
			System.out.println("O nome no momento é " + item);
		}
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " tem o valor: " + nomes.get(nome));

		}
		System.out.println("O primeiro nome é " + nomes.get(0));
		System.out.println("O Quarto nome é " + nomes.get(2));

		nomes.set(2, "Henrique atualizado");
		System.out.println("O terceiro nome é " + nomes.get(2));
		nomes.set(0, nomes.get(0).toUpperCase());
		System.out.println("O primeiro nome é " + nomes.get(0));
		
		System.out.println("Onde será que esta o Erick? "+nomes.indexOf("Erick"));
		nomes.remove(3);
		
		ArrayList<String> interesses= new ArrayList<>();
		interesses.add("Capgemini");
		interesses.add("Philips Clinical Informatics");
		interesses.add("Ambev Tech");
		interesses.add("Central Ailos");
		interesses.add("PremierSofts");
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Tenho "+interesses.size()+" interesses e eles são:");
		for (String interesse : interesses) {
			System.out.println(interesse);
			
		}
		System.out.println("O primeiro interesse favorito é "+interesses.get(0));
		System.out.println("O segundo interesse favorito é "+interesses.get(1));
		
		System.out.println("Posso abrir mão de "+interesses.get(3));
		interesses.remove(3);
		
		System.out.println("Eu também posso abrir mão de "+interesses.get(3));
		interesses.remove(interesses.indexOf("PremierSofts"));
	}

	private static void aprenderLinkedList() {

	}
}
