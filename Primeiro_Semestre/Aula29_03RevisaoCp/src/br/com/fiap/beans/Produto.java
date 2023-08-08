package br.com.fiap.beans;

public class Produto {

	private String tipo, marca;
	private double valor;
	private int quantidade;
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
	public double getValor() {
		return valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	
}
