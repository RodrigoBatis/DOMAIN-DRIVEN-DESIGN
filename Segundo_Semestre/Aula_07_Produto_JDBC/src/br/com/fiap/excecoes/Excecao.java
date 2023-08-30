package br.com.fiap.excecoes;

public class Excecao extends Exception{

	public Excecao() {
		super();
	}

	public Excecao(Exception e) {
		super();
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Digitou Letra ao invés de Número Inteiro");
		}else {
			System.out.println("Falha desconhecida");
		}
	}
	
}
