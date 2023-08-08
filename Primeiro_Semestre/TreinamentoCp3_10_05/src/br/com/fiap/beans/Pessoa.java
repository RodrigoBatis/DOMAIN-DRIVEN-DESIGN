package br.com.fiap.beans;

public class Pessoa {

	private String nome, email;
	private int idade;
	private double renda;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String email, int idade, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
	}

	public Pessoa(String nome, String email, int idade, double renda, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
		this.endereco = endereco;
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

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public double getRenda() {
		return renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public String identificador() {
		return "Indefinido";
	}
	
}
