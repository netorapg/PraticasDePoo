package br.edu.ifpr.renato;
import java.util.Random;

public class Jogo {
    public static void main(String[] args) throws Exception {
        Guerreiro guerreiro = new Guerreiro("Conan", 100, 20, 10);
        Mago mago = new Mago("Gandalf", 80, 30, 5);
        Random dado = new Random();
        

        while (guerreiro.estaVivo() && mago.estaVivo()) {
            int dadoGuerreiro = dado.nextInt(20);
            int dadoMago = dado.nextInt(20);
            if (dadoGuerreiro > dadoMago) {
                System.out.println(guerreiro.getNome() + " tirou " + dadoGuerreiro + " no dado. " + mago.getNome() + " tirou " + dadoMago + " no dado.");
                System.out.println(guerreiro.getNome() + " ataca primeiro!");
                guerreiro.atacar(mago); 
                System.out.println(guerreiro.getNome() + " tem " + guerreiro.getVida() + " de vida.");
                System.out.println(mago.getNome() + " tem " + mago.getVida() + " de vida.");
            } else {
                System.out.println(guerreiro.getNome() + " tirou " + dadoGuerreiro + " no dado. " + mago.getNome() + " tirou " + dadoMago + " no dado.");
                System.out.println(mago.getNome() + " ataca primeiro!");
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
