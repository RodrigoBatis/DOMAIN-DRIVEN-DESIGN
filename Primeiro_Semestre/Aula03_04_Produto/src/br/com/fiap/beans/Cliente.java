package br.com.fiap.beans;

public class Cliente {

	private Produto produto;
	private String nome;
	private int idade;
	private double peso;
	
	//Metodo Construtor vazio
	
	public Cliente(){
		super();	
	}
	
	//Metodo Construtor cheio
	
	public Cliente(String nome, int idade, double peso, Produto produto){
		super();
		this.nome 		= nome;
		this.idade 		= idade;
		this.peso 		= peso;
		this.produto 	= produto;
	}
	

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Produto getProduto() {
		return produto;
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
	
	
	
}
