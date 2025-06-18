package Models;

public class UserWeb extends User implements Autenticavel {
    private String senha;
    private String codigo2FA;

    public UserWeb(String nome, String email, String senha, String codigo2FA) {
        super(nome, email);
        this.senha = senha;
        this.codigo2FA = codigo2FA;
    }

    @Override
    public boolean autenticar() {
        System.out.println("Autenticando via login e senha + 2FA...");
        return senha.equals("senha123") && codigo2FA.equals("123456");
    }
}
