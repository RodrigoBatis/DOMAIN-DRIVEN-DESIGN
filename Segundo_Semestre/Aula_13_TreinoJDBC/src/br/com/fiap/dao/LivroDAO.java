package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;
import javax.swing.plaf.PanelUI;

import br.com.fiap.beans.Livro;
import br.com.fiap.conexoes.ConexaoFactory;
import oracle.net.aso.l;

public class LivroDAO {

	public Connection minhaConexao;
	
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	
	public String insert(Livro livro) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("INSERT INTO T_FIAP_LIVRO VALUES(?,?,?)");
		stmt.setInt(1, livro.getCodigo());
		stmt.setString(2, livro.getTitulo());
		stmt.setDouble(3, livro.getValor());
		stmt.execute();
		stmt.close();
		
		return "Livro Cadastrado com Sucesso!!! ✍(◔◡◔)";
	}
	
	public String deletar(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("DELETE FROM T_FIAP_LIVRO WHERE CODIGO = ?");
		stmt.setInt(1, livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Livro Deletado com Sucesso !!! (⓿_⓿)";
	}
	
	public String update(Livro livro) throws SQLException{
		PreparedStatement stmt = minhaConexao.prepareStatement
				("UPDATE T_FIAP_LIVRO SET TITULO = ?, VALOR = ?  WHERE CODIGO = ?");
		stmt.setString(1, livro.getTitulo());
		stmt.setDouble(2, livro.getValor());
		stmt.setInt(3, livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Livro Atualizado com Sucesso !!! (ง •_•)ง";
	}

	
	
}
