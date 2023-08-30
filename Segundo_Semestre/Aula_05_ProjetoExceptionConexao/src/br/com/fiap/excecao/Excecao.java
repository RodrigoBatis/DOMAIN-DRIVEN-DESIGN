package br.com.fiap.excecao;

public class Excecao extends Exception {
	
	public Excecao () {
		super();
		System.out.println("Mensagem de falha");
	}
	
	public Excecao(Exception erro) {
		super();
		if (erro.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Digitou outro caractere em vez de numero");
		}else {
			System.out.println("Falha desconhecida");
		}
	}
	
}
