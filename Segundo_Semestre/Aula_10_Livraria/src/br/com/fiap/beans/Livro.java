package br.com.fiap.beans;

public class Livro {

	private int codigo;
	private String autor, titulo;
	private int quantidade;
	private double valor;
	
	public Livro() {
		super();
	}

	public Livro(int codigo, String autor, String titulo, int quantidade, double valor) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.quantidade = quantidade;
		this.valor = valor;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}
	
}
