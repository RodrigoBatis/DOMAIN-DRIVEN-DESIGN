package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class AppDoWhile {

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

		//Instanciando 
		Cliente[] objVetorCliente = new Cliente[2];
		
		int indice = 0;
		
		//Entradas (indice)
		do {
			
			objVetorCliente[indice] = new Cliente();
			objVetorCliente[indice].setNome(texto("Nome: "));
			objVetorCliente[indice].setEmail(texto("E-mail: "));
			objVetorCliente[indice].setIdade(inteiro("Idade: "));
			objVetorCliente[indice].setValor(decemal("Valor: "));
			
			indice++;
			
		} while ( JOptionPane.showConfirmDialog(null, "Cadastrar mais Clientes?",
				"Cadastro de Clientes", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0 );
		
		//Saidas (contador)
		//for
		for (int i = 0; i < indice; i++) {
			System.out.println(
					"Nome: " + objVetorCliente[i].getNome() +
					"\nE-mail: " + objVetorCliente[i].getEmail() +
					"\nIdade: " + objVetorCliente[i].getIdade() +
					"\nValor: " + objVetorCliente[i].getValor() +
					"\n----------------------------------"
			);
		}

	}

}
