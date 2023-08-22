package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexao.ConexaoFactory;

public class TestConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection c = new ConexaoFactory().conexao();
		
		System.out.println("Conectado ao banco de dados, yeah!");
		c.close();
		
	}

}
