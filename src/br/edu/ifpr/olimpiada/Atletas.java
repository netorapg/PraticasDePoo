package br.edu.ifpr.olimpiada;

public class Atletas {
    private String nome;
    private int idade;
    private double peso;
    private String esporte;
    private String pais;

    public Atletas(String nome,  int idade, double peso, String esporte, String pais) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.esporte = esporte;
        this.pais = pais;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getEsporte() {
        return this.esporte;
    }

    public String getPais() {
        return this.pais;
    }
}
