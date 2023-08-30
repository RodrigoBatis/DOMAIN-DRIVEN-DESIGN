package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class AppProduto {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decemal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws Exception {
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objProduto = null;
		
		do {
			
			try {
				objProduto = new Produto();
				objProduto.setCodigo(inteiro("Código: "));
				objProduto.setMarca(texto("Marca: "));
				objProduto.setTipo(texto("Tipo: "));
				objProduto.setValorVenda(decemal("Valor Venda: "));
				objProduto.setValorCompra(decemal("Valor Compra: "));
				
				listaProdutos.add(objProduto);
				
			} catch (Exception e) {
				throw new Excecao(e);
			}finally {
				
			}
			
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais Produtos?",
				"Cadastro de Produtos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		for(Produto p : listaProdutos) {
			System.out.println(
					"Código: " + p.getCodigo() +
					"\nMarca: " + p.getMarca() +
					"\nTipo: " + p.getTipo() +
					"\nValor Venda: " + p.getValorVenda() +
					"\nValor Compra: " + p.getValorCompra() +
					"\n--------------------------------------"
			);
		}
		
		
	}

}
