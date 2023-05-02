package br.edu.ifpr.veterinario;

public class Animal {
    private int idade;
    private double peso;
    protected String som;

    public Animal(int idade, double peso, String som) {
        this.idade = idade;
        this.peso = peso;
        this.som = som;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getSom() {
        return this.som;
    }
}

