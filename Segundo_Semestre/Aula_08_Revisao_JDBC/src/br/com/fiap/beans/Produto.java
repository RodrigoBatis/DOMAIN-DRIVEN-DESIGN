package br.com.fiap.beans;

public class Produto {

	private String tipo, marca;
	private int quantidade;
	private double valorVenda, valorCompra;
	
	public Produto() {
		super();
	}

	public Produto(String tipo, String marca, int quantidade, double valorVenda, double valorCompra) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public String getTipo() {
		return tipo;
	}

	public String getMarca() {
		return marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public double getValorCompra() {
		return valorCompra;
	}
	
	
}
