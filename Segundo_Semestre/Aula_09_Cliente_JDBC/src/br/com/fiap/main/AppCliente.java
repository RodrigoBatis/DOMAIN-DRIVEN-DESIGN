package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecao;

public class AppCliente {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws Exception {
		
		Cliente objCliente = new Cliente();
		
		try {
			objCliente.setCodigo(inteiro("Digite o codigo: "));
		} catch (Exception e) {
			throw new Excecao(e);
		}finally {
			
		}
		
		

		System.out.println("Codigo: " + objCliente.getCodigo());
	}

}
