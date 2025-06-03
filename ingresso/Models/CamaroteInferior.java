package q3.Models;

public class CamaroteInferior extends Vip {
    protected String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String loc){
        super(valor, valorAdicional);
        this.localizacao = loc;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public String imprimeLocalizacao(){
        return "\nLocalização: "
                +localizacao;
    }

}
