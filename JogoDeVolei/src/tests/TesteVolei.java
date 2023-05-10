package tests;
import classModels.*;
import java.util.Scanner;

public class TesteVolei {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar jogador");
            System.out.println("2 - Lista de jogadores");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                System.out.println("Selecione o tipo de jogador:");
                System.out.println("1 - Levantador");
                System.out.println("2 - Ponteiro");
                System.out.print("Opção: ");
                int tipoJogador = sc.nextInt();

                if (tipoJogador == 1) {
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Idade: ");
                    int idade = sc.nextInt();
                    System.out.println("Capitão: ");
                    boolean capitao = sc.nextBoolean();
                    System.out.println("Altura: ");
                    double altura = sc.nextDouble();
                    Levantador l = new Levantador(nome, idade, capitao, altura);
                } else {
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Idade: ");
                    int idade = sc.nextInt();
                    System.out.println("Capitão: ");
                    boolean capitao = sc.nextBoolean();
                    System.out.println("Número de arremessos: ");
                    int numArremessos = sc.nextInt();
                    Ponteiro p = new Ponteiro(nome, idade, capitao, numArremessos);
                }
                System.out.println("Jogador cadastrado com sucesso!");

                break;
                case 2:
                System.out.println("Eis os jogadores cadastrados:");
                System.out.println("Levantadores:");
                
                

            }
        }
        while(opcao != 3);
        sc.close();
    }
}
