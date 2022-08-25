package br.edu.ifpb.padroes.imposto;
import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;


public interface TipoImpostoStrategy {
    BigDecimal calcular(Orcamento orcamento);
}
