package models;

public class Menu {
    public Menu(){}
    public int exibir(){
        System.out.println("\n_____________________MENU______________________");
        System.out.println("\n| [1]  - CADASTRAR CARRO                      |");
        System.out.println("\n| [2]  - CADASTRAR CAMINHÃO                   |");
        System.out.println("\n| [3]  - CADASTRAR VAN                        |");
        System.out.println("\n| [4]  - LISTAR TODOS OS VEÍCULOS ALUGÁVEIS   |");
        System.out.println("\n| [5]  - LISTAR TODOS OS VEÍCULOS CADASTRADOS |");
        System.out.println("\n| [6]  - LISTAR CARROS CADASTRADOS            |");
        System.out.println("\n| [7]  - LISTAR CAMINHÕES CADASTRADOS         |");
        System.out.println("\n| [8] - LISTAR VANS CADASTRADAS               |");
        System.out.println("\n| [0]  - SAIR                                |");
        System.out.println("\n_______________________________________________");
        return 0;
    }
}
