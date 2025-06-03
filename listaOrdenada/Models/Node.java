package Models;

public class Node<T> {
    private int elemento;
    private Node<T> proximo;

    public Node(int elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Node(int elemento, Node<T> proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public int getElemento() {
        return elemento;
    }

    public Node<T> getProximo(){
        return this.proximo;
    }

    public void setElemento(int elemento){
        this.elemento = elemento;
    }

    public void setProximo(Node<T> proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return  "\nElemento = "
                +elemento
                +"\nPróximo = " + proximo;
    }
}
