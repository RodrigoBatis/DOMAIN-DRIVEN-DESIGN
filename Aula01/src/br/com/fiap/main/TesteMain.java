package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;

public class TesteMain {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		
		//Entrada de dados
		objCliente.setNome("Braufagélio");
		objCliente.setIdade(20);
		
		//Saida de dados
		System.out.println("Nome:" + objCliente.getNome());
		System.out.println("-----------------------");
		System.out.println("Idade:" + objCliente.getIdade());
		
	}

}
