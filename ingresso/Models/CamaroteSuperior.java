package q3.Models;

public class CamaroteSuperior extends Vip {
    protected double valorAdicionalSuperior;

    public CamaroteSuperior(double valor, double valorVip, double valorAdicionalSuperior){
        super(valor, valorVip);
        this.valorAdicionalSuperior = valorAdicionalSuperior;;
}

    public double getValorCamaroteSuperior(){
        return this.valor + this.getValorVip() + valorAdicionalSuperior;
    }
}

