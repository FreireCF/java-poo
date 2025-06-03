package q2.Models.Models;

public class ProdutoEstadual extends Produto{

    public ProdutoEstadual(){}

    public ProdutoEstadual(String nome, String descricao, float valor, float imposto){
        super(nome, descricao, valor, imposto);
    }

    @Override
    public String toString(){ //reatório
        return "\nNome: "
                +nome
                +"\nDescrição: "
                +descricao
                +"\nValor: R$"
                +String.format("%.2f", valor)
                +"\nImposto: R$"
                +String.format("%.2f", imposto);
    }
}
