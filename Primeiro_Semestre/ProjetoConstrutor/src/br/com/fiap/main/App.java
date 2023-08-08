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
				JOptionPane.showInputDialog("Digite o nome da Oficina: "),
				JOptionPane.showInputDialog("Digite o CNPJ da Oficina: ")
		);
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o logradouro: "),
				JOptionPane.showInputDialog("Digite o cep: "),
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
				JOptionPane.showInputDialog("Digite o tipo de combústivel do carro: "),
				JOptionPane.showInputDialog("Digite o tipo roda do carro: ")		
		);
		Colaborador objColaborador = new Colaborador(
				JOptionPane.showInputDialog("Digite o nome do colaborador: "),
				JOptionPane.showInputDialog("Digite o RG do colaborador: "),
				JOptionPane.showInputDialog("Digite o cargo do colaborador: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do colaborador: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora do colaborador: "))		
		);
		
		
		objOficina.setCarro(objCarro);
		objOficina.setColaborador(objColaborador);
		objOficina.setEndereco(objEndereco);
		objCarro.setParteCarro(objParteCarro);

		System.out.println(
				"-- Informações da Oficina" +
				"\nNome: " + objOficina.getNome() +
				"\nCNPJ: " + objOficina.getCnpj() +
				"\n-- Informações de Endereço" +
				"\nLogradouro: " + objOficina.getEndereco().getLogradouro() +
				"\nCep: " + objOficina.getEndereco().getCep() +
				"\nNumero: " + objOficina.getEndereco().getNumero() +
				"\n--Informações do Colaborador" +
				"\nNome do Colaborador: " + objOficina.getColaborador().getNome() +
				"\nRG do Colaborador: " + objOficina.getColaborador().getRg() +
				"\nCargo do Colaborador: " + objOficina.getColaborador().getCargo() +
				"\nIdade do Colaborador: " + objOficina.getColaborador().getIdade() +
				"\nValor da hora do Colaborador: R$" + objOficina.getColaborador().getValorHora() +
				"\nValor do sálario do dia: R$" + objOficina.getColaborador().calcularTotalSalario(8) +
				"\n--Informações do Carro" +
				"\nMarca do Carro: " + objCarro.getMarca() +
				"\nModelo do Carro: " + objCarro.getModelo() +
				"\nAno do Carro: " + objCarro.getAno() +
				"\nPreço do Carro: R$" + objCarro.getValor() +
				"\nPartes do Carro: " +
				"\nMotor do Carro: " + objCarro.getParteCarro().getMotor() +
				"\nTipo combústivel do Carro: " + objCarro.getParteCarro().getCombustivel() +
				"\nQuantas rodas tem o Carro: " + objCarro.getParteCarro().getRoda()
		);
	}

}
