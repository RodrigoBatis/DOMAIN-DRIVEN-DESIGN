package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class AppArrayListWhile {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decemal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente objCliente = null;
		
		int continua = 0;
		
		while(continua == 0) {
			
			objCliente = new Cliente();
			objCliente.setNome(texto("Nome: "));
			objCliente.setEmail(texto("Email: "));
			objCliente.setIdade(inteiro("Idade: "));
			objCliente.setValor(decemal("Valor consulta: "));
			listaClientes.add(objCliente);
			
			continua = JOptionPane.showConfirmDialog(null, "Adicionar outro Cliente?",
					"Cadastrar Cliente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			
		}

		//foreach
				for (Cliente c : listaClientes) {
					System.out.println(
							"Nome: " + c.getNome()+
							"\nEmail: " + c.getEmail() +
							"\nIdade: " + c.getIdade() +
							"\nValor: " + c.getValor() +
							"\n-----------------------------------------"
							
					);
				}
		
	}

}
