package br.com.fiap.main;

import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteInsert {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		Cliente objCliente = new Cliente();
		
		objCliente.setCodigo(inteiro("Digite o código: "));
		objCliente.setNome(texto("Digite o nome: "));
		objCliente.setEmail(texto("Digite o email: "));
		objCliente.setValorMensalidade(real("Digite o valor mensalidade: "));
		
		System.out.println(dao.insert(objCliente));
		
	}

}
