package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Livro;
import br.com.fiap.conexoes.ConexaoFactory;

public class LivroDAO {

	public Connection minhaConexao;
	
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	public String insert(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("INSERT INTO T_FIAP_LIVRO VALUES (?,?,?,?)");
		stmt.setInt(1, livro.getCodigo());
		stmt.setString(2, livro.getTitulo());
		stmt.setString(3, livro.getAutor());
		stmt.setDouble(4, livro.getValor());
		stmt.execute();
		stmt.close();
		return "Livro cadastrado com Sucesso!";
	}
	
	public String delete(Livro livro) throws SQLException{
		PreparedStatement stmt = minhaConexao.prepareStatement
				("DELETE FROM T_FIAP_LIVRO WHERE CODIGO_LIVRO = ? ");
		stmt.setInt(1, livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		return "Deletado co m sucesso!";
	}
	
}
