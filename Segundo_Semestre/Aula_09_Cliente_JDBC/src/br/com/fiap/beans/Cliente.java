package br.com.fiap.beans;

public class Cliente {

	private int codigo;
	private String nome, email;
	private double valorMensalidade;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int codigo, String nome, String email, double valorMensalidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.valorMensalidade = valorMensalidade;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public double getValorMensalidade() {
		return valorMensalidade;
	}
	
}
