package br.edu.ifpb.padroes.orcamento;
import java.math.BigDecimal;

/**
 *
 * @author netod
 */
public class Orcamento {
    private BigDecimal valor;   
    private int quantidadeItens;
    public Orcamento(BigDecimal valor, int quantidadeItens){
        this.quantidadeItens = quantidadeItens;
        this.valor = valor;
    }
    public BigDecimal getValor(){
        return valor;
    }    
    public int getQuantidadeItens(){
        return quantidadeItens;
    }
}
