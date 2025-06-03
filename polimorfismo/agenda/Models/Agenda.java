package Models;
import Models.*;

public class Agenda {
    private String proprietario;
    private Pessoa[] pessoas;
    private int max;
    private int cont=0;

    public Agenda(String proprietario, int max){
        this.proprietario = proprietario;
        this.max = max;
    }

    public void addPessoa(Pessoa p){
        pessoas[cont] = p;
        cont++;
    }

    public Pessoa buscarPessoa(String nome){
        for(Pessoa i: pessoas){
            if(i.getNome().toUpperCase() == nome.toUpperCase()){
                return i;
            }
        }
        return null;
    }

    public void exibirPessoas(){
        for(Pessoa i : pessoas){
            i.exibir();
        }
    }

    public void exibirContatosPessoa(String nome){
        for(Pessoa i : pessoas){
            if(i.getNome().toUpperCase() == nome.toUpperCase()){
                i.exibir();
            }
        }
    }

    public void exibirPessoasComEmail(){
        for(Pessoa i : pessoas){
            if(i.possuiEmail()){
                i.exibir();
            }
        }
    }

    public void recuperarPessoaPorEmail(String email){
        for(Pessoa i : pessoas){
            for(Contato j : i.getContato()){
                for (Email k : j){
                    if(k.getEmail().toUpperCase() == email.toUpperCase());
                        k.exibir();
                }
            }
        }
    }

    public void recuperarPessoaPorTelefone(String telefone){
        for(Pessoa i : pessoas){
            for(Contato j : i.getContato()){
                for (Telefone k : j){
                    if(k.getTelefone().toUpperCase() == telefone.toUpperCase());
                        k.exibir();
                }
            }
        }
    }
}