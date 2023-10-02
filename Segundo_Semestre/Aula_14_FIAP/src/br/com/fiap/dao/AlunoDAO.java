package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexoes.ConexaoFactory;

public class AlunoDAO {

	public Connection minhaConexao;
	
	public AlunoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	
	public String inserir(Aluno aluno) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("INSERT INTO T_FIAP_ALUNO VALUES(?,?,?,?)");
			stmt.setInt(1, aluno.getRm());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getTurma());
			stmt.setDouble(4, aluno.getNota());
			stmt.execute();
			stmt.close();
			
		return "Cadastrado com Sucesso!";
	}
	
	
	
}
