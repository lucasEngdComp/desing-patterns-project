package br.edu.ifpb.padroes.sevico;
public class ServicoAdicional_2_Decorator extends ManutencaoDecorator{
    public ServicoAdicional_2_Decorator(Manutencao man){
        super(man);
        nome = "Backup";
        preco = 50;
    }
    
}
