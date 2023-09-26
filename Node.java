// Alunos: Marcelo Wzorek Filho & Fernando Zibetti

package br.com.arvore.logic;

class TreeNode {
	private int data;
	private TreeNode esquerda;
	private TreeNode direita;

	public TreeNode(int data) {
		this.data = data;
		this.esquerda = null;
		this.direita = null;
	}

	public int getData() {
		return data;
	}

	public TreeNode getEsquerda() {
		return esquerda;
	}

	public TreeNode getDireita() {
		return direita;
	}

	public void setEsquerda(TreeNode esquerda) {
		this.esquerda = esquerda;
	}

	public void setDireita(TreeNode direita) {
		this.direita = direita;
	}
}
