package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class App {

	public static void main(String[] args) {

		Empresa  objEmpresa  = new Empresa(
			JOptionPane.showInputDialog("Digite o nome da Empresa: "),
			JOptionPane.showInputDialog("Digite o tipo da Empresa: "),
			JOptionPane.showInputDialog("Digite o CNPJ da Empresa: ")
		);

		Endereco objEndereco = new Endereco(
			JOptionPane.showInputDialog("Digite o logradouro da Empresa: "),
			JOptionPane.showInputDialog("Digite o cep da Empresa: "),
			JOptionPane.showInputDialog("Digite o bairro da Empresa: "),
			JOptionPane.showInputDialog("Digite o município da Empresa: "),
			JOptionPane.showInputDialog("Digite o estado da Empresa: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Empresa: "))
		);

		Produto  objProduto  = new Produto(
			JOptionPane.showInputDialog("Digite o tipo do Produto: "),
			JOptionPane.showInputDialog("Digite a marca do Produto: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que essse Produto possui: ")),
			Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Produto: "))
		);
		
		objEmpresa.setEndereco(objEndereco);
		
		
		System.out.println(
			"-- Informações Sobre a Empresa: " +
			"\n\nNome da Empresa: " + objEmpresa.getNome() +
			"\nTipo da Empresa: " + objEmpresa.getTipo() +
			"\nCNPJ da Empresa: " + objEmpresa.getCnpj() +
			"\n\n-- Endereço da Empresa: " +
			"\n\nLogradouro: " + objEmpresa.getEndereco().getLogradouro() +
			"\nCep: " + objEmpresa.getEndereco().getCep() +
			"\nBairro: " + objEmpresa.getEndereco().getBairro() +
			"\nMunicípio: " + objEmpresa.getEndereco().getMunicipio() +
			"\nEstado: " + objEmpresa.getEndereco().getEstado() +
			"\nNúmero: " + objEmpresa.getEndereco().getNumero() +
			"\n\n-- Informações dos produtos da Empresa: " +
			"\n\nTipo produto: " + objProduto.getTipo() +
			"\nMarca produto: " + objProduto.getMarca() +
			"\nQuantidade produto: " + objProduto.getQuantidade() +
			"\nPreço produto: " + objProduto.getValor()
		);
		

	}

}
