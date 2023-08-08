package br.com.fiap.beans;

public class Telefone {
	
	private String fixo, celular, comercial, contato;


	public void setFixo(String fixo) {
		this.fixo = fixo;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public void setComercial(String comercial) {
		this.comercial = comercial;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public String getFixo() {
		return fixo;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public String getComercial() {
		return comercial;
	}

	public String getContato() {
		return contato;
	}
}
