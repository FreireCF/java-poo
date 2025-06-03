package q3.Models;

public class Vip extends Ingresso{
    protected double valorAdicional;

    public Vip (double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVip(){
        return valor+valorAdicional;
    }
}
