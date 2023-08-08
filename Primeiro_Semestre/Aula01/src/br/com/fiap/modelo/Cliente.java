package br.com.fiap.modelo;

public class Cliente {

	//Visibilidade, tipo de dadoe vareavel
	private String nome;
	private int idade;

	// Set
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public void setIdade (int idade){
		this.idade = idade;
	}
	
	// Get 
	
	public String getNome() {
		return nome;
	}

	public int getIdade(){
		return idade;
	}
}
