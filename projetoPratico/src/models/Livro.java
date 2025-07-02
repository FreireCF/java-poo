package models;
import java.util.ArrayList;
import java.util.List;
import models.*;

public class Livro {
    private String isbn;
    private String titulo;
    private String editora;
    private int qntCaps;
    List<Capitulo> capitulos = new ArrayList<>();

    public Livro(String isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
        this.editora = Constantes.EDITORA;
        this.qntCaps = qntCaps;
    }

    public void addCap(String titulo, int qntPaginas){
        Capitulo novoCap = new Capitulo(titulo, qntPaginas);
        capitulos.add(novoCap);
        qntCaps++;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getQntCaps(){
        return qntCaps;
    }

    public void exibirRelatorio(){
        System.out.println("Editora: "+Constantes.EDITORA);
        System.out.println("ISBN: "+isbn);
        System.out.println("Quantidade de capítulos: "+capitulos.size());
        System.out.println("Capítulos: ");
        for(Capitulo c : capitulos){
            System.out.println(c);
        }
    }
}