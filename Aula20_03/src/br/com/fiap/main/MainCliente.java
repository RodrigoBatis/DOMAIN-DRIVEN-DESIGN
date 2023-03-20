package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class MainCliente {

	public static void main(String[] args) {
		
		Cliente  objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ")));
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		
		objEndereco.setEstado("São Paulo");
		objEndereco.setLogradouro("Rua Apito");
		objEndereco.setCep("32768242");
		objEndereco.setBairro("Bairro tiradentes");
		objEndereco.setMunicipio("São Paulo");
		objEndereco.setNumero(212);
		
		objTelefone.setFoneFixo("(11)02024753");
		objTelefone.setFoneCelular("(11)7392794279");
		objTelefone.setFoneComercial("(11)3623674873");
		objTelefone.setFoneContato("(11)246872468");
		
		System.out.println("Nome: " + objCliente.getNome() +
				"\nIdade: " + objCliente.getIdade() +
				"\nPeso: " + objCliente.getPeso() +
				"\nRua: " + objCliente.getEndereco().getLogradouro() +
				"\nBairro: " + objCliente.getEndereco().getBairro() +
				"\nEstado: " + objCliente.getEndereco().getEstado() +
				"\nCep: " + objCliente.getEndereco().getCep() +
				"\nMunicipio: " + objCliente.getEndereco().getMunicipio() +
				"\nNumero: " + objCliente.getEndereco().getNumero() +
				"\nTelefone Fixo: " + objCliente.getTelefone().getFoneFixo() + 
				"\nTelefone Celular: " + objCliente.getTelefone().getFoneCelular() +
				"\nTelefone Comercial: " + objCliente.getTelefone().getFoneComercial() +
				"\nTelefone Contato: " + objCliente.getTelefone().getFoneContato());

	}

}
