package q3;
import org.w3c.dom.ls.LSOutput;
import q3.Models.*;

public class App {
    public static void main(String[] args) {

    Normal normal = new Normal(100);
    Vip vip = new Vip(100, 40);
    CamaroteInferior inferior = new CamaroteInferior(100, 60, "Setor A, fila 22");
    CamaroteSuperior superior = new CamaroteSuperior(100, 40, 80);

        System.out.println(normal.imprimeTipo());
        System.out.println("\nValor vip: "+vip.getValorVip()+"R$");
        System.out.println(inferior.imprimeLocalizacao());
        System.out.println("\nValor camarote superior: "+superior.getValorCamaroteSuperior());
}
}
