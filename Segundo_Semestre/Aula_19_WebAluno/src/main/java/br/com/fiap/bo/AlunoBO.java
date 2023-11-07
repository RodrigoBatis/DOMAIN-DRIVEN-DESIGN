package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class AlunoBO {

	AlunoDAO alunoDAO;
	
	// selecionar
	public ArrayList<Aluno> selecionarBO() throws ClassNotFoundException, SQLException{
		
		alunoDAO = new AlunoDAO();
		
		return (ArrayList<Aluno>) alunoDAO.selecionar() ;
				
	}
	
	// inserir
	public void inserirBO(Aluno aluno) throws ClassNotFoundException, SQLException {
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.inserir(aluno);
	}
	
	// atualizar
	public void atualizarBO(Aluno aluno) throws ClassNotFoundException, SQLException {
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.atualizar(aluno);
	}
	
	// deletar
	public void deletarBO(int rm) throws ClassNotFoundException, SQLException {
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.deletar(rm);
	}
}
