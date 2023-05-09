package br.edu.ifpr.volei;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteVolei {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    int opcao;


    do {
        System.out.println("\nMENU");
        System.out.println("1. Inserir novo jogador");
        System.out.println("2. Visualizar lista de jogadores");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch(opcao) {
            case 1:
            System.out.println("Selecione uma Categoria: ");
            System.out.println("1. Levantador - 2. Ponteiro");
            int categoria = sc.nextInt();

            if (categoria == 1) {
                System.out.print("Nome do jogador: ");
                String nome = sc.next();
                System.out.print("Idade do jogador: ");
                int idade = sc.nextInt();
                System.out.println("Altura do jogador: ");
                double altura = sc.nextDouble();
                System.out.println("Bom de bloqueio? ");
                boolean bomDeBloqueio = sc.nextBoolean();
                System.out.println("Capitão? ");
                boolean capitao = sc.nextBoolean();
                jogadores.add(new Levantador(nome, idade, altura, bomDeBloqueio, capitao));
            } else {
                System.out.print("Nome do jogador: ");
                String nome = sc.next();
                System.out.print("Idade do jogador: ");
                int idade = sc.nextInt();
                System.out.println("Altura do jogador: ");
                double altura = sc.nextDouble();
                System.out.println("Bom de bloqueio? ");
                boolean bomDeBloqueio = sc.nextBoolean();
                System.out.println("Capitão? ");
                boolean capitao = sc.nextBoolean();
                jogadores.add(new Ponteiro(nome, idade, altura, bomDeBloqueio, capitao));
            }
            System.out.println("Jogador inserido com sucesso!");

            break;
            case 2:
            System.out.println("Lista de jogadores: ");
            for (Jogador jogador : jogadores) {
                System.out.println(jogador);
            }
            break;
            case 3:
            System.out.println("Saindo...");
            break;
            default:
            System.out.println("Opção inválida!");
        }
    }
    while(opcao != 3);
    sc.close();
    }
    
}
