package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteCadastro {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar Objetos
		
		LivroDAO dao = new LivroDAO();
		
		Livro objetoLivro = new Livro();
		
		objetoLivro.setCodigo(inteiro("Codigo"));
		objetoLivro.setAutor(texto("Autor"));
		objetoLivro.setTitulo(texto("Titulo"));
		objetoLivro.setQuantidade(inteiro("Quantidade"));
		objetoLivro.setValor(real("Valor"));
		
		System.out.println(dao.inserir(objetoLivro));
		
		

	}

}
