package br.edu.ifpr.empresa.classes;

public final class Secretario extends Funcionario {
    
    private String idioma;
    private String genero;

    public Secretario (String nome, int idade, double salario, String idioma, String genero) {
        super(nome, idade, salario);
        this.idioma = idioma;
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getGenero() {
        return genero;
    }

    @Override

    public String getFuncao() {
        return "Secretário";
    }

    @Override
    public String toString() {
        return "Secretario [idioma=" + idioma + ", genero=" + genero + ", nome=" + nome + ", idade=" + idade
                + ", salario=" + salario + "]";
    }

}
