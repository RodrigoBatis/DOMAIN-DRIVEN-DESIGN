package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteUpdate {

	public static String text(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	public static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		LivroDAO dao = new LivroDAO();
		Livro objLivro = new Livro();

		objLivro.setCodigo(inteiro("Digite o codigo do livro a ser atualizado: "));
		objLivro.setTitulo(text("Titulo: "));
		objLivro.setValor(real("Valor: "));
		
		System.out.println(dao.update(objLivro));
	}

}
