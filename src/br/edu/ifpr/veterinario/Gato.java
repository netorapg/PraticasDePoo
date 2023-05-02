package br.edu.ifpr.veterinario;

public  class Gato extends Cachorro {
    private String cor;

    public Gato(int idade, double peso, String som, String raca, String cor) {
        super(idade, peso, som, raca);
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }
    
}
