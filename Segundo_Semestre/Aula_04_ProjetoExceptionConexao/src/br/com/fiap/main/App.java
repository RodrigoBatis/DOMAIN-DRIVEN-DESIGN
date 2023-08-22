package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecao.Excecao;

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

	public static void main(String[] args) throws Excecao{
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objProduto = null;
		
		do {
			
			try {
				
				objProduto= new Produto();
				objProduto.setTipo(texto("Digite o tipo do produto: "));
				objProduto.setMarca(texto("Digite a marca do produto: "));
				objProduto.setQuantidade(inteiro("Digite a quantidade desse produto: "));
				objProduto.setValor(decimal("Digite o preço do produto: "));
				
				listaProdutos.add(objProduto);
				
			} catch (Exception e) {
				throw new Excecao(e);
			}
			
			
			
		}while (JOptionPane.showConfirmDialog(null, "Adicionar Produto?",
				"Carrinho de Compras", JOptionPane.YES_NO_OPTION) ==0);
		
		for (Produto produto : listaProdutos) {
			System.out.println(
					"Tipo: " + produto.getTipo() +
					"\nQuantidade: " + produto.getQuantidade() + 
					"\nMarca: " + produto.getMarca() + 
					"\nValor: " + produto.getValor()
			);
		}

	}

}
