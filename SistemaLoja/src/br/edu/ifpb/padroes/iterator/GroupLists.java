package br.edu.ifpb.padroes.iterator;

import java.util.ArrayList;

public abstract class GroupLists {
	protected ArrayList<ProdutoName> produtos;
	public GroupLists() {
		produtos = new ArrayList<ProdutoName>();
	}
	public int count() {
		return produtos.size();
	}
	public IteradorDaLista criarIterator() {
		return new IteradorDaLista(produtos);
	}
}
