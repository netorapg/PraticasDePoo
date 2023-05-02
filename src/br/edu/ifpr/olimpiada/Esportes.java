package br.edu.ifpr.olimpiada;

public class Esportes {
    private String nome;
    private String tipo;
    private String local;

    public Esportes(String nome, String tipo, String local) {
        this.nome = nome;
        this.tipo = tipo;
        this.local = local;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getLocal() {
        return this.local;
    }
}
