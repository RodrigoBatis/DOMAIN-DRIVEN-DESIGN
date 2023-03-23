package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class MainCliente {

	public static void main(String[] args) {
		
		Cliente  objCliente  = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		//objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog(objCliente.getNome() +" digite a sua idade: ")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog(objCliente.getNome()+ " digite o seu peso: ")));
		objCliente.setEndereco(objEndereco);
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog(objCliente.getNome()+" digite o logradouro onde você mora: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(objCliente.getNome()+ " digite o numero da casa que você mora: ")));
		objEndereco.setBairro(JOptionPane.showInputDialog(objCliente.getNome()+" digite bairro onde você mora: "));
		objEndereco.setMunicipio(JOptionPane.showInputDialog(objCliente.getNome()+" digite o municipio que você mora: "));
		objEndereco.setCep(JOptionPane.showInputDialog(objCliente.getNome()+" digite o cep da sua casa: "));
		objEndereco.setNacionalidade(JOptionPane.showInputDialog(objCliente.getNome()+" digite sua nacionalidade: "));
		objEndereco.setEstado(JOptionPane.showInputDialog(objCliente.getNome()+" digite o estado onde mora: "));
		
		objTelefone.setCelular(JOptionPane.showInputDialog(objCliente.getNome()+" digite um telefone celular: "));
		objTelefone.setComercial(JOptionPane.showInputDialog(objCliente.getNome()+" digite um telefone comercial: "));
		objTelefone.setContato(JOptionPane.showInputDialog(objCliente.getNome()+" digite um telefone para contato: "));
		objTelefone.setFixo(JOptionPane.showInputDialog(objCliente.getNome()+" digite um telefone fixo:"
				+ ""
				+ " "));
		
		
		System.out.println("\n********************************************************" +
				"\n\n***** Informações pessoais *****\n" +
				"\nNome: " + objCliente.getNome() +
				"\nIdade: " + objCliente.getIdade() +
				"\nPeso: " + objCliente.getPeso() +
				"\n\n***** Endereço *****\n" +
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
				"\nNumero: " + objCliente.getEndereco().getNumero() +
				"\nBairro: " + objCliente.getEndereco().getBairro() +
				"\nMunicupio: " + objCliente.getEndereco().getMunicipio() +
				"\nCep: " + objCliente.getEndereco().getCep() +
				"\nNacionalidade: " + objCliente.getEndereco().getNacionalidade() +
				"\nEstado: " + objCliente.getEndereco().getEstado() +
				"\n\n***** Cantato *****\n" +
				"\nTelefone Celular: " + objTelefone.getCelular() +
				"\nTelefone Comercial: " + objTelefone.getComercial() +
				"\nTelefone para Contato: " + objTelefone.getContato() +
				"\nTelefone Fixo: " + objTelefone.getFixo() + "\n"+
				"\n********************************************************");
		

	}

}
