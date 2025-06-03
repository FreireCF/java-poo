package Models;
import Models.*;
import java.util.Objects;

public class ListaEncadeada<T>{
    private Node<T> inicio;
    private int tam;

    public void inserirElemento(int elemento){
        Node<T> celula = new Node<T>(elemento);
        celula.setProximo(inicio);
        this.inicio = celula;
        this.tam++;
    }

    public int getTam(){
        return tam;
    }

    public void exibir(){
       if(this.tam == 0){
           System.out.println("\n[NULL]");
       }
       Node<T> aux = inicio;
       System.out.print("\n[");
       while(aux != null){
           System.out.print(" "+aux.getElemento());
           System.out.print(" ->");
           aux = aux.getProximo();
       }
        System.out.print(" NULL ]");
    }

    public void ordenar(){ //bubble sort
        Node<T> aux = null;
        int temp;
        boolean trocou;

        if(this.tam <= 1){
            return;
        }

        do{
            aux = this.inicio;
            trocou = false;
            while (aux != null && aux.getProximo() != null) {
                if (aux.getElemento() > aux.getProximo().getElemento()) {
                    temp = aux.getElemento();
                    aux.setElemento(aux.getProximo().getElemento());
                    aux.getProximo().setElemento(temp);
                    trocou = true;
                }
                aux = aux.getProximo();
            }
        } while(trocou);
    }

    public void remover(int num){
        if(tam == 0){
            return;
        }

        if(inicio.getElemento() == num){
            inicio = inicio.getProximo();
            tam--;
            return;
        }

        Node<T> aux = this.inicio.getProximo();
        Node<T> anterior = this.inicio;

        while (aux != null) {
            if (aux.getElemento() == num) {
                anterior.setProximo(aux.getProximo());
                tam--;
                return;
            }
            anterior = aux;
            aux = aux.getProximo();
        }
    }

    public void informarValorNaPos(int pos){
        Node<T> aux = this.inicio;
        int cont=0;
        while(aux != null){
            if(cont==pos){
                System.out.println("\nValor encontrado: "+aux.getElemento());
            }
            aux = aux.getProximo();
            cont++;
        }
    }
}