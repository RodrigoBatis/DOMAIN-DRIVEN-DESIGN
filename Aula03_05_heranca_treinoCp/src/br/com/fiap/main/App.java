package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Boi;
import br.com.fiap.beans.Humano;


public class App {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		Humano objHumano = new Humano(
			texto("Digite o nome do humano: ") ,
			inteiro("Digite a idade do humano: ") ,
			real("Digite o peso do humano: ") ,
			real("Digite a velocidade do humano: ") ,
			texto("Digite o RG do humano: ")
		);

		Boi objBoi = new Boi(
			texto("Digite o nome do boi: ") ,
			inteiro("Digite a idade do boi: ") ,
			real("Digite o peso do boi: ") ,
			real("Digite a velocidade do boi: ") ,
			real("Digite o tamanho do chifre do boi: ")
		);
		
		System.out.println(
			"--- Informações humano ---" +
			"\nNome: " + objHumano.getNome() +
			"\nIdade: " + objHumano.getIdade() +
			"\nPeso: " + objHumano.getPeso() +
			"\nVelocidade: " + objHumano.getVelocidade() +
			"\nRG: " + objHumano.getRg() +
			"\n--- Informações boi ---" +
			"\nNome: " + objBoi.getNome() +
			"\nIdade: " + objBoi.getIdade() +
			"\nPeso: " + objBoi.getPeso() +
			"\nVelocidade: " + objBoi.getVelocidade() +
			"\nTamanho chifre: " + objBoi.getTemanhoChifre() +
			"\n---------------------------"
		);

	}

}
