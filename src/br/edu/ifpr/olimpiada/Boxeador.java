package br.edu.ifpr.olimpiada;

public class Boxeador extends Atletas {
    private String categoria;
    private boolean destro;

    public Boxeador(String nome, int idade, double peso, String esporte, String pais, String categoria, boolean destro) {
        super(nome, idade, peso, esporte, pais);
        this.categoria = categoria;
        this.destro = destro;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public boolean Destro() {
        return this.destro == true;
    }
    
}
