package q2.Models.Models;

public class Produto {
    protected String nome;
    protected String descricao;
    protected float valor;
    protected float imposto;

    public Produto(){}

    public Produto(String nome, String descricao, float valor, float imposto){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public float getValor(){
        return valor;
    }

    public float getImposto(){
        return imposto;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public void setImposto(float imposto){
        this.imposto = imposto;
    }

    public String toString(){ //relatório
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