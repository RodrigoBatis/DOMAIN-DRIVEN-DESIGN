package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastrar {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar 
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto objProduto = new Produto();
		
		objProduto.setCodigo(inteiro("Codigo"));
		objProduto.setTipo(texto("Tipo"));
		objProduto.setMarca(texto("Marca"));
		objProduto.setValorVenda(real("Valor Venda"));
		objProduto.setValorCompra(real("Valor Compra"));
		
		System.out.println(dao.inserir(objProduto));
		

	}

}
