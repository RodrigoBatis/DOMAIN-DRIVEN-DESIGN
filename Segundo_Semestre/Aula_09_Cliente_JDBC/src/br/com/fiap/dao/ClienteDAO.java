package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClienteDAO {

	public Connection minhaConexao;
	
	public ClienteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert 
	
	public String insert (Cliente cliente) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("insert into TBL_CLIENTE values (?,?,?,?)");
		
		stmt.setInt(1, cliente.getCodigo());
		stmt.setString(2, cliente.getNome());
		stmt.setString(3, cliente.getEmail());
		stmt.setDouble(4, cliente.getValorMensalidade());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso!";
	}

	// Delete
	
	public String deletar (Cliente cliente) throws SQLException{
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("DELETE FROM TBL_CLIENTE WHERE cd_cliente = ?");
		
		stmt.setInt(1, cliente.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Deletado com Sucesso!";
	}

	
}
