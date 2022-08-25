package br.edu.ifpb.padroes.iterator;

public class ListaConcreta extends GroupLists {
	public ListaConcreta() {
		produtos.add(new ProdutoName("Monitor"));
		produtos.add(new ProdutoName("Computador"));
		produtos.add(new ProdutoName("Mouse"));
		produtos.add(new ProdutoName("Teclado"));
		produtos.add(new ProdutoName("Memoria"));
	}

}
