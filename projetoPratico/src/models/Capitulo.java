package models;

import org.w3c.dom.ls.LSOutput;

public class Capitulo {
    protected int numCap;
    protected String titulo;
    protected int qntPaginas;
    protected static int cont=0;

    public Capitulo(String titulo, int qntPaginas){
        this.titulo = titulo;
        this.qntPaginas = qntPaginas;
        cont++;
        this.numCap = cont;
    }

    public int getNum() {
        return numCap;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getQntPaginas(){
        return qntPaginas;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setQntPaginas(int qntPaginas){
        this.qntPaginas = qntPaginas;
    }

    public String toString(){
        return
                String.format("Capítulo: ")+numCap
                +String.format(" - " )+titulo
                +String.format(" (")+qntPaginas
                +String.format(" páginas")
                +String.format(")");
    }
}
