package br.com.fiap.beans;

public class Cliente {

	private String nome, email;
	private int idade;
	private double valor;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String email, int idade, double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public double getValor() {
		return valor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
