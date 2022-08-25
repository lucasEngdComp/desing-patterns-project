package br.edu.ifpb.padroes.desconto;

import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;

public abstract class DescontoTemplateMethod {
    protected DescontoTemplateMethod proximo;
    public DescontoTemplateMethod( DescontoTemplateMethod proximo){
        this.proximo = proximo;
    }
    public BigDecimal calcular(Orcamento orcamento){
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }
    protected abstract boolean deveAplicar(Orcamento orcamento);

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);    
        
}
