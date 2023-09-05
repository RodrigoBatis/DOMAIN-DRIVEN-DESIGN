package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;


public class ProdutoDAO {

	public Connection minhaConexao;
	
	//Metodo Construtor com Conexao
	
	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	
	public String inserir (Produto produto) {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("INSERT INTO TBL_PRODUTO ");
		
		return "Cadastrado com Sucesso!!!";
	}
	
}
