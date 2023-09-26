// Alunos: Marcelo Wzorek Filho & Fernando Zibetti

package br.com.arvore.logic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner scanner = new Scanner(System.in);
		int escolha;
		int valor;
		do {
			System.out.print("1. Para Inserir um valor na lista\n2. Para Remover um valor na lista\n"
					+ "3. Para escolha uma forma de Print da lista\n4. Para Sair do programa\n Escolha: ");
			escolha = scanner.nextInt();

			if (escolha == 1) {
				System.out.print("\nDigite um valor a ser inserido: ");
				valor = scanner.nextInt();
				tree.insert(valor);

			} else if (escolha == 2) {
				do {
					System.out.print("\n1. Remover o Maior elemento\n2. Remover o Menor elemento\n3. Sair\nEscolha: ");
					escolha = scanner.nextInt();
					if (escolha == 1) {
						tree.removerMaiorNuemroNaArvore();
					} else if (escolha == 2) {
						tree.removerMenorNumeroNaArvore();
					} else if (escolha == 3) {
						break;
					} else {
						System.out.println("Escolha Invalida");
					}
				} while (escolha == 3);

			} else if (escolha == 3) {
				do {
					System.out
							.println("\n1. Print Inordem\n2. Print Pós-ordem\n3. Print Pré-ordem\n4. Sair\nEscolha: ");
					escolha = scanner.nextInt();
					if (escolha == 1) {
						tree.printInOrdem();
					} else if (escolha == 2) {
						tree.printPosOrdem();
					} else if (escolha == 3) {
						tree.printPreOredem();
					} else {
						System.out.println("Escolha Invalida");
					}
				} while (escolha == 4);

			} else {
				System.out.println("Escolha Invalida");

			}
		} while (escolha != 4);
		scanner.close();
	}
}
