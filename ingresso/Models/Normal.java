package q3.Models;

public class Normal extends Ingresso{

    public Normal(double  valor){
        super(valor);
    }

    public String imprimeTipo() {
        return "\nIngresso normal";
    }
}
