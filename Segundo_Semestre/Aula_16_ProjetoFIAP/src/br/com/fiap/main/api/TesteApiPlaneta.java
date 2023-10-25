package br.com.fiap.main.api;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Planeta;
import br.com.fiap.services.SwService;

public class TesteApiPlaneta {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		SwService sw = new SwService();
		
		String p = JOptionPane.showInputDialog("Informe o numero do planeta a ser pesquisado: ");

		Planeta planeta = sw.getPlaneta(p);
		
		System.out.println(planeta);
		
	}

}
