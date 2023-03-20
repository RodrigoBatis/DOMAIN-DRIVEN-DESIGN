package br.com.fiap.modelo;

public class Cliente {

	// Visibilidade , tipo de dado e nome vareavel
		private String nomeCliente;
		private int idadeCliente;
		private double pesoCliente;
		

		// Criando os seters para setar o nome e a idade do cliente
		public void setNomeCliente (String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		
		public void setIdadeCliente (int idadeCliente) {
			this.idadeCliente = idadeCliente;
		}
		
		public void setPesoCliente (double pesoCliente) {
			this.pesoCliente = pesoCliente;
		}
		
		// Criando os geters para mostrar o nome e idade do cliente cadastrado
		public String getNomeCliente () {
			return nomeCliente;
		}
		
		public int getIdadeCliente () {
			return idadeCliente;
		}
		
		public double getPesoCliente () {
			return pesoCliente;
		}
		
}
