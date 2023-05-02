package br.edu.ifpr.renato;

public abstract class Personagem {
    private String nome;
    private int vida;
    protected int defesa;

    public Personagem(String nome, int vida, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
    }

    public abstract void atacar (Personagem alvo);

    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVida() {
        return this.vida;
    }

    public int getDefesa() {
        return this.defesa;
    }
}