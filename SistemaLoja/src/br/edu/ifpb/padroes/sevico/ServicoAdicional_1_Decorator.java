package br.edu.ifpb.padroes.sevico;
public class ServicoAdicional_1_Decorator extends ManutencaoDecorator{
    public ServicoAdicional_1_Decorator(Manutencao man){
        super(man);
        nome = "Limpeza";
        preco = 30;
    }
    
}
