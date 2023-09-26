// Alunos: Marcelo Wzorek Filho & Fernando Zibetti

package br.com.arvore.logic;

public class BinaryTree {
	private TreeNode head; // Draiz

	public BinaryTree() {
		head = null; // Construtor
	}

	public void insert(int data) {
		head = insertChamada(head, data);
	}

	private TreeNode insertChamada(TreeNode head, int data) {
		if (head == null) { // Se árvore estiver vazia, cria um novo nó
			head = new TreeNode(data);
			return head;
		}
		if (data < head.getData()) { // Se valor inserido <= valor nó atual
			head.setEsquerda(insertChamada(head.getEsquerda(), data)); // Insert esquerda
		} else if (data > head.getData()) { // Se valor inserido > valor nó atual
			head.setDireita(insertChamada(head.getDireita(), data)); // Insert direita
		} else if (data == head.getData()) {
			System.out.println("esse valor já consta na arvore");
		}
		return head;
	}

	/*
	 * Pré-ordem também conhecida como pré-fixada, é a ordem em que o nó raiz é
	 * visitado antes de seus filhos.
	 */
	public void printPreOredem() {
		printPreOrdemChamada(head);
		System.out.println();
	}

	private void printPreOrdemChamada(TreeNode head) {
		// enquanto não chegar na ultima folha (inesistente)
		if (head != null) {
			printInOrdemChamada(head.getEsquerda());
			System.out.print(head.getData() + " ");
			printInOrdemChamada(head.getDireita());
		}
	}

	/*
	 * Inordem ,também conhecida como simétrica, é // a ordem em que o nó raiz é
	 * visitado entre seus filhos. A visita ocorre da seguinte forma: esquerda,
	 * raiz, direita
	 */

	public void printInOrdem() {
		printInOrdemChamada(head);
		System.out.println();
	}

	private void printInOrdemChamada(TreeNode head) {
		if (head != null) {
			printInOrdemChamada(head.getEsquerda());
			System.out.print(head.getData() + " ");
			printInOrdemChamada(head.getDireita());
		}
	}

	/*
	 * Pós-ordem ,também conhecida como pós-fixada, é a ordem em que o nó raiz é
	 * visitado após seus filhos. A visita ocorre da seguinte forma: esquerda,
	 * direita, raiz
	 */

	public void printPosOrdem() {
		printPosOrdemChamada(head);
		System.out.println();
	}

	private void printPosOrdemChamada(TreeNode head) {
		if (head != null) {
			printPosOrdemChamada(head.getEsquerda());
			printPosOrdemChamada(head.getDireita());
			System.out.print(head.getData() + " ");
		}
	}

	public void removerMaiorNuemroNaArvore() {
		head = removerMaiorNumeroNaArvoreChamada(head);
	}

	private TreeNode removerMaiorNumeroNaArvoreChamada(TreeNode head) {
		if (head == null) {
			return null;
		} else if (head.getDireita() == null) {
			return head.getEsquerda();
		} else {
			head.setDireita(removerMaiorNumeroNaArvoreChamada(head.getDireita()));
			return head;
		}
	}

	public void removerMenorNumeroNaArvore() {
		head = removerMenorNumeroNaArvoreChamada(head);
	}

	private TreeNode removerMenorNumeroNaArvoreChamada(TreeNode head) {
		if (head == null) {
			return null;
		} else if (head.getEsquerda() == null) {
			return head.getDireita();
		} else {
			head.setEsquerda(removerMenorNumeroNaArvoreChamada(head.getEsquerda()));
			return head;
		}
	}
}
