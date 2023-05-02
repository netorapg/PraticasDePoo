package br.edu.ifpr.olimpiada;
import java.util.Scanner;


    public class Olimpiadas {
        public static void main (String [] args) throws Exception {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome do esporte:");
            String nome = input.nextLine();
            System.out.println("Digite o tipo do esporte:");
            String tipo = input.nextLine();
            System.out.println("Digite o local do esporte:");
            String local = input.nextLine();
            EsportesContato esporte = new EsportesContato(nome, tipo, local);
            System.out.println("Nome: " + esporte.getNome() + "\nTipo: " + esporte.getTipo() + "\nLocal: " + esporte.getLocal());
        
        input.close();
        }
    }
    
