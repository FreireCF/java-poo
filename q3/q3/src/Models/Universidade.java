package Models;

import java.util.Locale;
import java.util.Objects;

public class Universidade {
    private String nome;
    private Departamento[] departamentos;

    public Universidade(String nome, Departamento[] departamentos) {
        this.nome = nome;
        this.departamentos = departamentos;
    }
}