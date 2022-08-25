package br.edu.ifpb.padroes.sevico;
public class ManutencaoDecorator extends Manutencao{
    Manutencao manutencao;
    public ManutencaoDecorator(Manutencao man){
        manutencao = man;
    }
    public String getNome(){
        return manutencao.getNome()+ " + " + nome;
    }
    public double getPreco(){
        return manutencao.getPreco() + preco;
    }
}
