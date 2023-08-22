package br.com.fiap.main;



import javax.swing.JOptionPane;

import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class App {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
//		nome, email, idade, renda
		PessoaJuridica objPJ = new PessoaJuridica(
				texto("Digite seu nome: "),
				texto("Digite seu email: "),
				inteiro("Digite a idade da empresa: "),
				decimal("Digite a renda da empresa: "),
				texto("Digite o cnpj da empresa: ")
		);
		PessoaFisica objPF = new PessoaFisica(
				texto("Digite seu nome: "),
				texto("Digite seu email: "),
				inteiro("Digite a sua idade: "),
				decimal("Digite a sua renda: "),
				texto("Digite o seu cpf: ")
		);
		
		System.out.println(
				  "--------------------------------------------"
				+ "\n Identificação:   " + objPF.identificador() + ":"
				+ "\n--------------------------------------------"
				+ "\nNome Pessoa Física: " + objPF.getNome() 
				+ "\nE-mail Pessoa Física: " + objPF.getEmail()
				+ "\nIdade Pessoa Física: " + objPF.getIdade()
				+ "\nRenda Pessoa Física: " + objPF.getRenda()
				+ "\nCPF Pessoa Física: " + objPF.getCpf()
				+ "\nTaxa a ser paga: " + objPF.pagarTaxa()
				+ "\n--------------------------------------------"
				+ "\n Identificação:   " + objPJ.identificador() + ":"
				+ "\n--------------------------------------------"
				+ "\nNome Pessoa Jurídica: " + objPJ.getNome() 
				+ "\nE-mail Pessoa Jurídica: " + objPJ.getEmail()
				+ "\nIdade Pessoa Jurídica: " + objPJ.getIdade()
				+ "\nRenda Pessoa Jurídica: " + objPJ.getRenda()
				+ "\nCNPJ Pessoa Jurídica: " + objPJ.getCnpj()
				+ "\nTaxa a ser paga: " + objPF.pagarTaxa()
				+ "\n--------------------------------------------"
				
		);
	}

}
