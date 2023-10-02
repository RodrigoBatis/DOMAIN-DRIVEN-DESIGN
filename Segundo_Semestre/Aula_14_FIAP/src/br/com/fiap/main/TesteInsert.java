package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.dao.AlunoDAO;

public class TesteInsert {

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
		
		Aluno objAluno = new Aluno();
		
		AlunoDAO dao = new AlunoDAO();

		objAluno.setRm(inteiro("RM: "));
		objAluno.setNome(text("Nome: "));
		objAluno.setTurma(text("Turma: "));
		objAluno.setNota(real("Nota: "));
		
		System.out.println(dao.inserir(objAluno));
		
	}

}
