package br.com.fiap.beans;

public class Livro {

	private int codigo;
	private String titulo, autor;
	private double valor;
	
	public Livro() {
		super();
	}
	
	public Livro(int codigo, String titulo, String autor, double valor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.valor = valor;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getValor() {
		return valor;
	}
	
	
}
