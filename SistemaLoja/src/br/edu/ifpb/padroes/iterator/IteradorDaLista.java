package br.edu.ifpb.padroes.iterator;

import java.util.ArrayList;

public class IteradorDaLista {

	ArrayList<ProdutoName> lista;
	int contador;

	protected IteradorDaLista(ArrayList<ProdutoName> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void first() {
		contador = 0;
	}

	public void proximoItem() {
		contador++;
	}

	public void voltarItem() {
		contador--;
	}

	public boolean isDone() {
		return contador == lista.size();
	}

	private ProdutoName currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}

	public String getNomeItem() {
		return currentItem().nome;
	}
}
