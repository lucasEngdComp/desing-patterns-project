package br.edu.ifpb.padroes.imposto;
import br.edu.ifpb.padroes.orcamento.Orcamento;
import java.math.BigDecimal;
/**
 *
 * @author netod
 */
public class ISSStrategy  implements TipoImpostoStrategy{
    public BigDecimal calcular(Orcamento orcamento){
        System.out.print("ISS: ");
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }    
}
