package q1.Models;

public class PecaImportada extends Peca{
    protected float taxaImportacao;
    protected float frete;

    public PecaImportada(){}

    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float frete){
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.frete = frete;
    }

    public float getTaxaImportacao(){
        return taxaImportacao;
    }

    public float getFrete(){
        return frete;
    }

    public void setTaxaImportacao(float taxaImportacao){
        this.taxaImportacao = taxaImportacao;
    }

    public void setFrete(float frete){
        this.frete = frete;
    }

    @Override
    public float calcularPreco(){
        return lucro+custo+taxaImportacao+frete;
    }

    @Override
    public String exibir(){
        return "\nNome: "
                +nome
                +"\nCusto: R$"
                +String.format("%.2f", custo)
                +"\nLucro: R$"
                +String.format("%.2f", lucro)
                +"\nTaxa de Importação: R$"
                +String.format("%.2f", taxaImportacao)
                +"\nFrete: R$"
                +String.format("%.2f", frete)
                +"\n";
    }
}