package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class App {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws Exception {
		
//		List<Produto> listaProdutos = new ArrayList<Produto>();
		Produto objProduto = new Produto();
		
		try {
			
			objProduto.setQuantidade(inteiro("Digite a quantidade"));
			
		} catch (Exception e) {
			throw new Excecao(e);
		}finally {
			
		}
		
		
		System.out.println("Quantidade: " + objProduto.getQuantidade());

	}

}
