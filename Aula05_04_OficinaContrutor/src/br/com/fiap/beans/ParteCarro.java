package br.com.fiap.beans;

public class ParteCarro {

	private String motor, combustivel, roda;
	
	// Metodo construtor vazio
	public ParteCarro() {
		super();
	}
	
	// Metodo contrutor cheio
	public ParteCarro(String motor, String radiador, String roda) {
		super();
		this.motor = motor;
		this.combustivel = radiador;
		this.roda = roda;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setRadiador(String radiador) {
		this.combustivel = radiador;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}

	public String getMotor() {
		return motor;
	}

	public String getRadiador() {
		return combustivel;
	}

	public String getRoda() {
		return roda;
	}
	

	
	
}
