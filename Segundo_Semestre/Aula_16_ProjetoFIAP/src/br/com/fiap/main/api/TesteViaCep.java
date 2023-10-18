package br.com.fiap.main.api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteViaCep {

	public static void main(String[] args) throws ClientProtocolException, IOException{
		
		ViaCepService viaCepService = new ViaCepService();

		String cep = "08485420" ;
		
		Endereco endereco = viaCepService.getEndereco(cep);
		
		System.out.println(endereco);
		
	}

}
