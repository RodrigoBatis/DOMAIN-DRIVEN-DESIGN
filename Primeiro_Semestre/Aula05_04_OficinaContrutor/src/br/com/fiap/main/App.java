package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.ParteCarro;

public class App {

	public static void main(String[] args) {
		
		Oficina objOficina = new Oficina(
			JOptionPane.showInputDialog("Digite o nome: "),
			JOptionPane.showInputDialog("Digite o CNPJ: ")
		);

		Endereco objEndereco = new Endereco(
			JOptionPane.showInputDialog("Digite o logradouro: "),
			JOptionPane.showInputDialog("Digite o cep: "),
			JOptionPane.showInputDialog("Digite o bairro: "),
			JOptionPane.showInputDialog("Digite o municipio: "),
			JOptionPane.showInputDialog("Digite o estado: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "))
		);

		Carro objCarro = new Carro(
			JOptionPane.showInputDialog("Digite a marca do carro: "),
			JOptionPane.showInputDialog("Digite o modelo do carro: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: ")),
			Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do carro: "))
		);
		
		ParteCarro objParteCarro = new ParteCarro(
			JOptionPane.showInputDialog("Digite o motor do carro: "),
			JOptionPane.showInputDialog("Digite o radiador do carro: "),
			JOptionPane.showInputDialog("Digite a roda do carro: ")
		);

		Colaborador objColaborador = new Colaborador(
			JOptionPane.showInputDialog("Digite o nome do colaborador: "),
			JOptionPane.showInputDialog("Digite o RG do colaborador: "),
			JOptionPane.showInputDialog("Digite o cargo do colaborador: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do colaborador: ")),
			Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario do colaborador: "))
		);
		
		objOficina.setCarro(objCarro);
		objOficina.setColaborador(objColaborador);
		objOficina.setEndereco(objEndereco);
		objCarro.setParteCarro(objParteCarro);
		
		System.out.println(
				"-- Informações da Oficina" +
				"\nNome: " + objOficina.getNome() +
				"\nCNPJ: " + objOficina.getCnpj() 
		);


	}

}
