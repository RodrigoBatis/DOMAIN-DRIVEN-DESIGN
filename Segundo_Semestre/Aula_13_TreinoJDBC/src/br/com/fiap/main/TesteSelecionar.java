package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		LivroDAO dao = new LivroDAO();
		
		List<Livro> listaLivros = (ArrayList<Livro>) dao.selecionar();

		if (listaLivros != null) {
			for(Livro livro: listaLivros) {
				System.out.println(livro.getCodigo() + 
						" " + livro.getTitulo() +
						" " + livro.getValor());
			}
		}
		
	}

}
