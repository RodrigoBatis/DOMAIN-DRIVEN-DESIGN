package br.com.fiap.main;
import br.com.fiap.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		
		objCliente.setNomeCliente("Irineu Tadeu Tadeu");
		objCliente.setIdadeCliente(18);
		objCliente.setPesoCliente(58.05);
		
		System.out.println("Bem vindo(a) " + objCliente.getNomeCliente() +
				"\nvocê possui " + objCliente.getIdadeCliente() + 
				"\ne seu peso é de " + objCliente.getPesoCliente() + "kg" );

	}

}
