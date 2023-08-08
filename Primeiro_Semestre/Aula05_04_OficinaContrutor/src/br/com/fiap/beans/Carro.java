package br.com.fiap.beans;

public class Carro {

	private String marca, modelo;
	private int ano;
	private double valor;
	private ParteCarro parteCarro;
	
	// Metodo construtor vazio
	public Carro() {
		super();
	}

	// Metodo contrutor sem atributos de referencia
	public Carro(String marca, String modelo, int ano, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	// Metodo contrutor cheio
	public Carro(String marca, String modelo, int ano, double valor, ParteCarro parteCarro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.parteCarro = parteCarro;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setParteCarro(ParteCarro parteCarro) {
		this.parteCarro = parteCarro;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public double getValor() {
		return valor;
	}

	public ParteCarro getParteCarro() {
		return parteCarro;
	}
	
	
}
