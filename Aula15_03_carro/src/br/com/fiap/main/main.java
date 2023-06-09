package br.com.fiap.main;

import br.com.fiap.modelo.Carro;
import br.com.fiap.modelo.Motor;

public class main {

	public static void main(String[] args) {
		
		Carro objCarro = new Carro();
		Motor objMotor = new Motor();
		
		objCarro.setMarca("Nissan");
		objCarro.setModelo("Skyline GT-R R34");
		objCarro.setAno(1964);
		objCarro.setValor(36.000);
		objCarro.setMotor(objMotor);
		
		objMotor.setMarcaMotor("Nissan RB26DETT");
		objMotor.setPotencia(2.6);
		objMotor.setTipoCambio("Manual");
		
		
		System.out.println("-------------------------------------");
		System.out.println("Marca: " + objCarro.getMarca() +
				"\nModelo: " + objCarro.getModelo() +
				"\nAno: " + objCarro.getAno() +
				"\nValor: " + objCarro.getValor() +
				"\n----- Informações sobre o motor ----- " +
				"\n- Marca do motor: " + objCarro.getMotor().getMarcaMotor() +
				"\n- Potência do motor: " + objCarro.getMotor().getPotencia() +
				"\n- Tipo do cambio: " + objCarro.getMotor().getTipoCambio());
		System.out.println("-------------------------------------");

	}

}
