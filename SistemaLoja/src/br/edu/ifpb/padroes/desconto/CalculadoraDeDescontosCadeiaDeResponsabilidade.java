package br.edu.ifpb.padroes.desconto;

import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeDescontosCadeiaDeResponsabilidade {
    public BigDecimal calcular(Orcamento orcamento){
        DescontoTemplateMethod cadeia = new RegraQuantidade(
            new RegraValor(
                    new SemDesconto()));
        return cadeia.calcular(orcamento);     
    }
}
 
