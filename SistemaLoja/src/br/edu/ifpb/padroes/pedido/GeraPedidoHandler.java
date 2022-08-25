package br.edu.ifpb.padroes.pedido;
import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.time.LocalDateTime;
import java.util.List;


public class GeraPedidoHandler {

	private List<PedidoObserver> Acoes;
	
	public GeraPedidoHandler(List<PedidoObserver> acoesAposGerarPedidos) {
		Acoes = acoesAposGerarPedidos;
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		this.Acoes.forEach(a -> a.executarAcao(pedido));
	}
	
}
