package models;

public class Frota {
    private Carro[] carros;
    private Caminhao[] caminhoes;
    private Van[] vans;
    private int contCarro, contCaminhao, contVan;

    public void cadastrarCarro(String placa, String marca, String modelo, int anoFab, int numPortas) {
        carros[contCarro] = new Carro(placa, marca, modelo, anoFab, numPortas);
        contCarro++;
    }

    public void cadastrarCaminhao(String placa, String marca, String modelo, int anoFab, double totalCarga, int numEixos) {
        caminhoes[contCaminhao] = new Caminhao(placa, marca, modelo, anoFab, totalCarga, numEixos);
        contCaminhao++;
    }

    public void cadastrarVan(String placa, String marca, String modelo, int anoFab) {
        vans[contVan] = new Van(placa, marca, modelo, anoFab);
        contVan++;
    }

    public void listarFrota() {
        System.out.println("\nLista de Carros: ");
        for (Carro c : carros) {
            c.exibirDados();
        }

        System.out.println("\nLista de Caminhões: ");
        for (Caminhao cm : caminhoes) {
            cm.exibirDados();
        }

        System.out.println("\nLista de Vans: ");
        for (Van v : vans) {
            v.exibirDados();
        }
    }
    public void listarCarro(){
        System.out.println("\nLista de Carros: ");
        for(Carro c : carros){
            c.exibirDados();
        }
    }

    public void listarCaminhao(){
        System.out.println("\nLista de Carros: ");
        for(Caminhao cm : caminhoes){
            cm.exibirDados();
        }
    }

    public void listarVan(){
        System.out.println("\nLista de Carros: ");
        for(Van v : vans){
            v.exibirDados();
        }
    }

    public void listarAlugaveis(){
        System.out.println("\nLista de veículos alugáveis: ");
        for(Carro c : carros){
            if(c==null){
                return;
            }
            c.getModelo();
            System.out.println("\nValor para três dias: R$ ");
            System.out.print(c.aluguelTresDias());
        }

        for(Van v : vans){
            if(v==null){
                return;
            }
            v.getModelo();
            System.out.println("\nValor para três dias: R$ ");
            System.out.print(v.aluguelTresDias());
        }
    }
}
