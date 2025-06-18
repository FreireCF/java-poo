package Models;

public abstract class User {
    protected String nome;
    protected String email;

    public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}
