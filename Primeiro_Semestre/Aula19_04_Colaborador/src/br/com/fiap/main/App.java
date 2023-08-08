package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class App {

	public static void main(String[] args) {

		Colaborador objColaborador 	= new Colaborador(
			JOptionPane.showInputDialog("Digite o nome do colaborador: "),
			JOptionPane.showInputDialog("Digite o cargo do colaborador: "),
			Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora desse colaborador: ")),
			Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas de trabalho: "))
		);

		Endereco 	objEndereco 	= new Endereco(
			JOptionPane.showInputDialog("Digite o logradouro: "),
			JOptionPane.showInputDialog("Digite o cep: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "))
		);

		objColaborador.setEndereco(objEndereco);
		
		System.out.println(
				"-- Informações Colaborador --" +
				"\n\nNome: " + objColaborador.getNome() +
				"\nCargo: " + objColaborador.getCargo() +
				"\nValor Hora: " + objColaborador.getValorHora() +
				"\nSalário do Colaborador: " +  objColaborador.calcularSalario() +
				"\n-- Informações Endereço --" +
				"\n\nLogradouro: " + objColaborador.getEndereco().getLogradouro() +
				"\nCep: " + objColaborador.getEndereco().getCep() +
				"\nNúmero: " + objColaborador.getEndereco().getNumero() +
				"\n-------------------------------"
		);
		
		
	}

}
