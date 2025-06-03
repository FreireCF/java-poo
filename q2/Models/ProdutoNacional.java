package q2.Models.Models;

public class ProdutoNacional extends Produto{
    protected float taxa;

    public ProdutoNacional(String nome, String descricao, float valor, float imposto, float taxa){
        super(nome, descricao, valor, imposto);
        this.taxa = taxa;
    }

    @Override
    public String toString(){ //relatório
        return "\nNome: "
                +nome
                +"\nDescrição: "
                +descricao
                +"\nValor: R$"
                +String.format("%.2f", valor)
                +"\nImposto: R$"
                +String.format("%.2f", imposto)
                +"\nTaxa: R$"
                +String.format("%.2f",taxa);
    }
}
