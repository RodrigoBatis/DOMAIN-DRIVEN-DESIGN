package br.com.fiap.modelo;

public class Motor {
	
	private String	marcaMotor;
	private double	potencia;
	private String	tipoCambio;
	
	public void setMarcaMotor(String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}
	
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	public String getMarcaMotor() {
		return marcaMotor;
	}
	
	public double getPotencia() {
		return potencia;
	}

	public String getTipoCambio() {
		return tipoCambio;
	}
	
}
