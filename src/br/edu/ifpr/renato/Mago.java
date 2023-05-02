package br.edu.ifpr.renato;

public class Mago extends Personagem {
    private int poderMagico;

    public Mago(String nome, int vida, int poderMagico, int defesa) {
        super(nome, vida, defesa);
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.poderMagico - alvo.defesa;
        alvo.receberDano(dano);
        System.out.println(this.getNome() + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
    }
    
}
