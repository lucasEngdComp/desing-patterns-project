package br.edu.ifpb.padroes.imposto;
import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author netod
 */
public class CalculaImposto {
    public BigDecimal calcular(Orcamento orcamento, TipoImpostoStrategy tipoImposto){
        return tipoImposto.calcular(orcamento);
    }    
}
