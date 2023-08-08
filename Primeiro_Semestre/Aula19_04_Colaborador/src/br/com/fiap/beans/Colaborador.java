package br.com.fiap.beans;

public class Colaborador {

	private String nome, cargo;
	private Endereco endereco;
	private double valorHora;
	private double qtddHoras;
	
	public Colaborador() {
		super();
	}
	
	public Colaborador(String nome, String cargo, double valorHora, double qtddHoras) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.qtddHoras = qtddHoras;
	}
	
	public Colaborador(String nome, String cargo, Endereco endereco, double valorHora) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
		this.valorHora = valorHora;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public void setQtddHoras(double qtddHoras) {
		this.qtddHoras = qtddHoras;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public double getValorHora() {
		return valorHora;
	}


	public double getQtddHoras() {
		return qtddHoras;
	}
	
	// Métodos Workers
	
	public double calcularSalario() {
		return valorHora * qtddHoras;
	}
	
	
	
	
	
	
	
}
