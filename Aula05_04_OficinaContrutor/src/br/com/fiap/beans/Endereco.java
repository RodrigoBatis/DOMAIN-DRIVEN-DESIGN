package br.com.fiap.beans;

public class Endereco {

	private String logradouro, cep, bairro, municipio, estado;
	private int numero;
	
	// Metodo construtor vazio	
	public Endereco() {
		super();
	}

	// Metodo contrutor cheio	
	public Endereco(String logradouro, String cep, String bairro, String municipio, String estado, int numero) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.numero = numero;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getEstado() {
		return estado;
	}

	public int getNumero() {
		return numero;
	}
	

}
