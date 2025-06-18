package Models;

public class UserApi extends User implements Autenticavel {
    private String token;

    public UserApi(String nome, String email, String token) {
        super(nome, email);
        this.token = token;
    }

    @Override
    public boolean autenticar() {
        System.out.println("Autenticando via token de acesso...");
        return token.equals("TOKEN_VALIDO_ABC123");
    }
}

