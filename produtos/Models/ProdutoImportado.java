package q2.Models.Models;

public class ProdutoImportado extends ProdutoNacional {
    protected float taxaImportacao;

    public ProdutoImportado(String nome, String descricao, float valor, float imposto, float taxa, float taxaImportacao){
        super(nome, descricao, valor, imposto, taxa);
        this.taxaImportacao = taxaImportacao;
    }

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
                +String.format("%.2f",taxa)
                +"\nTaxa de importação: R$"
                +String.format("%.2f",taxaImportacao);
    }
}
