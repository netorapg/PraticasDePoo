package br.edu.ifpr.renato;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int vida, int forca, int defesa) {
        super(nome, vida, defesa);
        this.forca = forca;
        
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.forca - alvo.defesa;
        if (dano > 0) {
            alvo.receberDano(dano);
            System.out.println(this.getNome() + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
        }else {
            System.out.println(this.getNome() + " atacou " + alvo.getNome() + " e causou 0 de dano.");
        }
    }
}
