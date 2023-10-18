package br.com.fiap.model;

public class Endereco {

	private String cep, logradouro, bairro, ddd;

	public Endereco() {
		super();
	}

	public Endereco(String cep, String logradouro, String bairro, String ddd) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.ddd = ddd;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public String getDdd() {
		return ddd;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	
	
}
