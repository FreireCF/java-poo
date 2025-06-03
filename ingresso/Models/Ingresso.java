package q3.Models;

import org.w3c.dom.ls.LSOutput;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public String imprimeValor(){
        return "\nValor do  ingresso: "+valor;
    }

}