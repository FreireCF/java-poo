import Models.*;

public class App {
    public static void main(String[] args) {
        Autenticavel[] usuarios = new Autenticavel[3];

        usuarios[0] = new UserApp("Ana", "ana@app.com");
        usuarios[1] = new UserWeb("Carlos", "carlos@web.com", "senha123", "123456");
        usuarios[2] = new UserApi("Robô API", "api@empresa.com", "TOKEN_VALIDO_ABC123");

        for (Autenticavel user : usuarios) {
            if (user instanceof User) {
                ((User) user).exibirDados();
            }

            Autenticavel usuario;
            boolean sucesso = usuarios.autenticar();
            System.out.println("Autenticação " + (sucesso ? "bem-sucedida!" : "falhou!") + "\n");
        }
    }
}
