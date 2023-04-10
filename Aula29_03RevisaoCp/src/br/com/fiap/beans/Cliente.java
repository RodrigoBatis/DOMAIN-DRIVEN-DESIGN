package br.com.fiap.beans;

public class Cliente {

	private String nome;
	private int idade;
	private double peso;
	private Endereco endereco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	
}
