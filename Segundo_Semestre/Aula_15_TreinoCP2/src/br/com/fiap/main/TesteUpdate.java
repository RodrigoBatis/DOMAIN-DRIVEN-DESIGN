package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteUpdate {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AlunoDAO dao = new AlunoDAO();
		Aluno objAluno = new Aluno();

		objAluno.setRm(inteiro("Digite a Rm do aluno a ser editado: "));
		objAluno.setNome(texto("Digite o novo nome: "));
		objAluno.setTurma(texto("Digite a nova turma: "));
		objAluno.setNota(decimal("Digite a nova nota: "));
		
		System.out.println(dao.update(objAluno));
		
	}

}
