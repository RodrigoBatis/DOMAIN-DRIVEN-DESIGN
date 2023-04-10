package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class main {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		
		objCliente.setNome(JOptionPane.showInputDialog("Por favor digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog(objCliente.getNome() + " por favor digite sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog(objCliente.getNome() + " por favor digite seu peso:")));
		
		System.out.println("---------- Informações Inseridas ----------" +
		"\nNome: " +objCliente.getNome() +
		"\nIdade: " +objCliente.getIdade() +
		"\nPeso: " + objCliente.getPeso() +
		"\n-------------------------------------------");

	}

}
