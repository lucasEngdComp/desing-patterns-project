package br.edu.ifpb.padroes.desconto;

import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;


public class RegraQuantidade extends DescontoTemplateMethod{
    public RegraQuantidade(DescontoTemplateMethod proximo){
        super(proximo);
    }
        public BigDecimal efetuarCalculo(Orcamento orcamento) {
                System.out.print("Seu desconto para compras acima de 10 itens: ");
		return orcamento.getValor().multiply(new BigDecimal("0.07"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 10;
	}

}
