package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class App {

	static String texto(String j){
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro (String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal (String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {

		PessoaJuridica objPessoaJuridica = new PessoaJuridica(
				texto("Digite o nome: "),
				texto("Digite o email: "),
				inteiro("Digite a idade: "),
				decimal("Digite a renda: "),
				texto("Digite a razãoSocial: "),
				texto("Digite o CNPJ: ")
		);

		PessoaFisica objPessoaFisica = new PessoaFisica(
				texto("Digite o nome: "),
				texto("Digite o email: "),
				inteiro("Digite a idade: "),
				decimal("Digite a renda: "),
				texto("Digite o RG: "),
				texto("Digite o CPF: ")
		);
		Endereco  objEndereco = new Endereco(
				texto("Digite o logradouro: ")
		);

		
		System.out.println(
				"-------------------------------------------"
				+ "\nInformações Pessoa Juridíca" 
				+ "\n-------------------------------------------" 
				+ "\nNome: " + objPessoaJuridica.getNome() 
				+ "\nEmail: " + objPessoaJuridica.getEmail() 
				+ "\nIdade: " + objPessoaJuridica.getIdade()
				+ "\nRenda: " + objPessoaJuridica.getRenda()
				+ "\nRazão Social: " + objPessoaJuridica.getRazaoSocial()
				+ "\nCNPJ: " + objPessoaJuridica.getCnpj()
				+ "\nIdentificador: " + objPessoaJuridica.identificador()
				+ "\n-------------------------------------------" 
				+ "\nInformações Pessoa Física"
				+ "\n-------------------------------------------"
				+ "\nNome: " + objPessoaFisica.getNome() 
				+ "\nEmail: " + objPessoaFisica.getEmail() 
				+ "\nIdade: " + objPessoaFisica.getIdade()
				+ "\nRenda: " + objPessoaFisica.getRenda()
				+ "\nRG: " + objPessoaFisica.getRg()
				+ "\nCPF: " + objPessoaFisica.getCpf()
				+ "\nIdentificador: " + objPessoaFisica.identificador()
				+ "\n-------------------------------------------" 
		);
	}

}
