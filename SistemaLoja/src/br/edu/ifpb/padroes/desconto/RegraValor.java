package br.edu.ifpb.padroes.desconto;

import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;


public class RegraValor extends DescontoTemplateMethod{
    public RegraValor(DescontoTemplateMethod proximo){
        super(proximo);
    }
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        System.out.print("Seu desconto para compras acima de R$500,00: ");
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
	}

	@Override
    public boolean deveAplicar(Orcamento orcamento) {
	return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
