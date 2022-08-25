package br.edu.ifpb.padroes.pedido;

public class NotificarObserver implements PedidoObserver {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Compra realizada com sucesso!");
	}

}
