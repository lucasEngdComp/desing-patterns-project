package br.edu.ifpb.padroes.desconto;

import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;

public class SemDesconto extends DescontoTemplateMethod {

	public SemDesconto() {
		super(null);
	}
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
                System.out.print("Não houve desconto pois não havia compras superior a 10 itens ou R$500,00: ");
		return BigDecimal.ZERO;
	}
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
}
