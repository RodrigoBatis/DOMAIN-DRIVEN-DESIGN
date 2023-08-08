package br.com.fiap.beans;

public class Telefone {

	private String foneFixo;
	private String foneCelular;
	private String foneComercial;
	private String foneContato;
	
	public void setFoneFixo(String foneFixo) {
		this.foneFixo = foneFixo;
	}
	
	public void setFoneCelular(String foneCelular) {
		this.foneCelular = foneCelular;
	}
	
	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
	}
	
	public void setFoneContato(String foneContato) {
		this.foneContato = foneContato;
	}
	
	public String getFoneFixo() {
		return foneFixo;
	}
	
	public String getFoneCelular() {
		return foneCelular;
	}
	
	public String getFoneComercial() {
		return foneComercial;
	}
	
	public String getFoneContato() {
		return foneContato;
	}
}
