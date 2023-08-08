package br.com.fiap.beans;

public class ParteCarro {

	private String motor, combustivel, roda;
	
	// Metodo construtor vazio
	public ParteCarro() {
		super();
	}
	
	// Metodo contrutor cheio
	public ParteCarro(String motor, String combustivel, String roda) {
		super();
		this.motor = motor;
		this.combustivel = combustivel;
		this.roda = roda;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}

	public String getMotor() {
		return motor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public String getRoda() {
		return roda;
	}
	

	
	
}
