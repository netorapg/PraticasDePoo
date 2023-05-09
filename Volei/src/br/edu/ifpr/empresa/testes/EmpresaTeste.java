package br.edu.ifpr.empresa.testes;
import java.util.Scanner;
import java.util.ArrayList;
import br.edu.ifpr.empresa.classes.*;

public class EmpresaTeste {
    
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                System.out.println("Qual funcionário deseja cadastrar?");
                System.out.println("1 - Gerente");
                System.out.println("2 - Secretário");
                System.out.println("3 - Voltar ao menu");
                System.out.println("Digite a opção desejada: ");
                int cargo = sc.nextInt();

                if (cargo == 1) {
                    System.out.println("Digite o nome do gerente: ");
                    String nome = sc.next();
                    System.out.println("Digite a idade do gerente: ");
                    int idade = sc.nextInt();
                    System.out.println("Digite o salário do gerente: ");
                    double salario = sc.nextDouble();
                    System.out.println("Digite o departamento do gerente: ");
                    String departamento = sc.next();
                    System.out.println("Digite o turno do gerente: ");
                    String turno = sc.next();
                    funcionarios.add(new Gerente(nome, idade, salario, departamento, turno));
                }
                else if (cargo == 2) {
                    System.out.println("Digite o nome do secretário: ");
                    String nome = sc.next();
                    System.out.println("Digite a idade do secretário: ");
                    int idade = sc.nextInt();
                    System.out.println("Digite o salário do secretário: ");
                    double salario = sc.nextDouble();
                    System.out.println("Digite o idioma do secretário: ");
                    String idioma = sc.next();
                    System.out.println("Digite o gênero do secretário: ");
                    String genero = sc.next();
                    funcionarios.add(new Secretario(nome, idade, salario, idioma, genero));
                }
                else if (cargo == 3) {
                    break;
                }
                else {
                    System.out.println("Opção inválida!");
                }
                case 2:
                for (Funcionario funcionario : funcionarios) {
                    System.out.println(funcionario);
                }
                break;
                case 3:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção inválida!");

            }
        }
        while (opcao != 3);   
        sc.close(); 
    }

    
}
