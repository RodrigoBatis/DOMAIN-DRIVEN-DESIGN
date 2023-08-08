package br.com.fiap.beans;

public class Colaborador {

	private String nome, rg, cargo;
	private int idade;
	private double valorHora;

	// Metodo construtor vazio
	public Colaborador() {
		super();
	}
	
	// Metodo contrutor cheio
	public Colaborador(String nome, String rg, String cargo, int idade, double valorHora) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cargo = cargo;
		this.idade = idade;
		this.valorHora = valorHora;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}

	public String getCargo() {
		return cargo;
	}

	public int getIdade() {
		return idade;
	}

	public double getValorHora() {
		return valorHora;
	}
	
	public double calcularTotalSalario (int quantidadeHoras) {
		return valorHora* quantidadeHoras;
	}
	
	
}
