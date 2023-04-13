package br.com.fiap.beans;

public class Empresa {

	
	private String nome, tipo, cnpj;
	private Endereco endereco;
	
	public Empresa() {
		super();
	}

	public Empresa(String nome, String tipo, String cnpj) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpj = cnpj;
	}

	public Empresa(String nome, String tipo, String cnpj, Endereco endereco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
	
	
}
