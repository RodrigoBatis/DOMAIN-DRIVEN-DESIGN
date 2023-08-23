package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class AppVetorWhile {

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
		//Instanciar
		Cliente[] vetorCliente = new Cliente[3];
		
		int indice = 0;
		int continuar = 0;
		
		while (continuar == 0) {
			vetorCliente[indice] = new Cliente();
			vetorCliente[indice].setNome(texto("Nome: "));
			vetorCliente[indice].setEmail(texto("E-mail: "));
			vetorCliente[indice].setIdade(inteiro("Idade: "));
			vetorCliente[indice].setValor(decemal("Valor: "));
			indice++;
			
			continuar = JOptionPane.showConfirmDialog(null, "Cadastrar Mais Clientes?", 
					"Cadastro Cliente", JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
		}
		
		for (int i = 0; i < indice; i++) {
			System.out.println(
					"Nome: " + vetorCliente[i].getNome() +
					"\nE-mail: " + vetorCliente[i].getEmail() +
					"\nIdade: " + vetorCliente[i].getIdade() +
					"\nValor: " + vetorCliente[i].getValor() +
					"\n----------------------------------"
			);
		}

	}

}
