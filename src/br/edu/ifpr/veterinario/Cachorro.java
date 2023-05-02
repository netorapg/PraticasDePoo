package br.edu.ifpr.veterinario;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(int idade, double peso, String som, String raca) {
        super(idade, peso, som);
        this.raca = raca;

       
    }
    public void fazerSom(String som){
        this.som = som;
    }
    public String getRaca(){
        return this.raca;
    }
}
