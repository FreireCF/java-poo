package Models;

public class Pessoa {
    private Contato[] contatos;
    private String nome;
    private int max;
    private int cont;

    public Pessoa(String nome, int max) {
        this.nome = nome;
        this.max = max;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarContato(Contato c) {
        if (cont > max) {
            System.out.println("\nAgenda está cheia");
            return;
        }
        contatos[cont] = c;
        cont++;
    }

    public Contato[] getContato() {
        return contatos;
    }

    public Contato[] getContatoPorTipo(String tipo) {
        Contato[] porTipo = new Contato[this.max];
        int cont=0;

        for (Contato i : contatos) {
            if(i.getTipo().toUpperCase() == tipo.toUpperCase()){
                porTipo[cont] = i;
                cont ++;
            }
        }
        if(cont == 0){
            System.out.println("\nTipo não encontrado");
            Contato[] vazio = new Contato[0];
            return vazio;
        }
        return porTipo;
    }

    public boolean possuiEmail(){
        for(Contato i : contatos){
            if(i.getTipo().toUpperCase() == "EMAIL"){
                return true;
            }
        }
        return false;
    }
    public boolean possuiTelefone(){
        for(Contato i : contatos){
            if(i.getTipo().toUpperCase() == "TELEFONE"){
                return true;
            }
        }
        return false;
    }

    public void exibir(){
        System.out.println("\n Nome: "+getNome());
        System.out.println("\nContatos: ");
        for(Contato i : contatos){
            i.exibir();
        }
    }
}