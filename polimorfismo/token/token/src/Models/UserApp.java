package Models;

public class UserApp extends User implements Autenticavel {
    public UserApp(String nome, String email) {
        super(nome, email);
    }

    @Override
    public boolean autenticar() {
        System.out.println("Autenticando via biometria (impressão digital ou facial)...");
        return true;
    }
}

