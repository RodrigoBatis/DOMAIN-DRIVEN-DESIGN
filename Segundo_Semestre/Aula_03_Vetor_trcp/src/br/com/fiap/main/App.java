package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class App {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		for(int c = 0; c < i; c ++) {
			total += p[c].getValor() * p[c].getQuantidade();
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		Produto[] vetorProduto = new Produto[5];
		
		
		int indice = 0;
		
		do {
			//Entradas
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Digite o tipo do produto: "));
			vetorProduto[indice].setMarca(texto("Digite a marca do produto: "));
			vetorProduto[indice].setQuantidade(inteiro("Digite a quantidade desse produto: "));
			vetorProduto[indice].setValor(decimal("Digite o preço do produto: "));
			
			indice++;
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carinho? ", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
			//Saidas
				for(int contador = 0; contador < indice; contador++ ) {
					System.out.println(
							  "----------------------------------------------------"
							+ "\nMarca: " + vetorProduto[contador].getMarca()
							+ "\nTipo: " + vetorProduto[contador].getTipo()
							+ "\nQuantidade: " + vetorProduto[contador].getQuantidade()
							+ "\nValor: " + vetorProduto[contador].getValor()
							+ "\n----------------------------------------------------"
							+ "\n\n"
					);
				}
				
				System.out.println("VALOR DA COMPRA: " + valorTotal(vetorProduto, indice));
				
	}

}
