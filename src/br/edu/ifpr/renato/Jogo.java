package br.edu.ifpr.renato;
import java.util.Random;

public class Jogo {
    public static void main(String[] args) throws Exception {
        Guerreiro guerreiro = new Guerreiro("Conan", 100, 20, 10);
        Mago mago = new Mago("Gandalf", 80, 30, 5);
        Random dado = new Random();
        int dadoGuerreiro = dado.nextInt(20);
        int dadoMago = dado.nextInt(20);

        while (guerreiro.estaVivo() && mago.estaVivo()) {
            if (dadoGuerreiro > dadoMago) {
                guerreiro.atacar(mago); 
                System.out.println(guerreiro.getNome() + " tem " + guerreiro.getVida() + " de vida.");
                System.out.println(mago.getNome() + " tem " + mago.getVida() + " de vida.");
            } else {
                mago.atacar(guerreiro);
                System.out.println(guerreiro.getNome() + " tem " + guerreiro.getVida() + " de vida.");
                System.out.println(mago.getNome() + " tem " + mago.getVida() + " de vida.");
            }
            
        }

        if (guerreiro.estaVivo()) {
            System.out.println(guerreiro.getNome() + " venceu!");
        } else {
            System.out.println(mago.getNome() + " venceu!");
        }
    }
}
