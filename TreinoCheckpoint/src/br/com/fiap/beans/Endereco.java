package br.com.fiap.beans;

public class Endereco {

	private String logradouro, cep, bairro, municipio, estado, nacionalidade;
	private int numero;
	
	
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
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
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
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public int getNumero() {
		return numero;
	}
}
