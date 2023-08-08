package br.com.fiap.main;

import br.com.fiap.modulo.Produto;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto objProduto = new Produto();
		
		objProduto.setMarca("Lacoste");
		objProduto.setTipo("Polo");
		objProduto.setQuantidade(25);
		objProduto.setPreco(549.00);
		
		System.out.println("No estoque possui " + objProduto.getQuantidade() + 
				" \nunidades de camisas do tipo " + objProduto.getTipo() +
				" \nda marca " + objProduto.getMarca() +
				"\ncom o preço R$" + objProduto.getPreco() + " por unidade!");

	}

}
