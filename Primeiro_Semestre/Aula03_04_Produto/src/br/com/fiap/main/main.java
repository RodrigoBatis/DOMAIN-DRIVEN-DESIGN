package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class main {

	public static void main(String[] args) {
		
		Produto objProduto = new Produto();
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Digite o nome: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: ")),
				objProduto);
		
		
//		objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
//		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ")));
//		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ")));
//		objCliente.setProduto(objProduto);
		
		objProduto.setMarca(JOptionPane.showInputDialog("Digite a marca do produto: "));
		objProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos: ")));
		objProduto.setTipo(JOptionPane.showInputDialog("Digite o tipo do produto: "));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
		
		System.out.println("----- Informações Pessoais -----" +
				"\nNome: " + objCliente.getNome() +
				"\nIdade: " + objCliente.getIdade() +
				"\nPeso: " + objCliente.getPeso() +
				"\n----- Informações do produto -----" +
				"\nMarca: " + objCliente.getProduto().getMarca() +
				"\nQuantidade: " + objCliente.getProduto().getQuantidade() +
				"\nTipo: " + objCliente.getProduto().getTipo() +
				"\nValor: " + objCliente.getProduto().getValor()+
				"\n----------------------------------");

	}

}
