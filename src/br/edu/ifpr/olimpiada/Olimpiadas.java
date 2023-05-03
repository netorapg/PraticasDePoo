package br.edu.ifpr.olimpiada;
import java.util.Scanner;


    public class Olimpiadas {
        public static void main (String [] args) throws Exception {
            boolean destroOuCanhoto = true;
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome do esporte:");
            String nome = input.nextLine();
            System.out.println("Digite o tipo do esporte:");
            String tipo = input.nextLine();
            System.out.println("Digite o local do esporte:");
            String local = input.nextLine();
            EsportesContato esporte = new EsportesContato(nome, tipo, local);
            System.out.println("Nome: " + esporte.getNome() + "\nTipo: " + esporte.getTipo() + "\nLocal: " + esporte.getLocal());
            
            System.out.println("Digite o nome do atleta:");
            String nomeAtleta = input.nextLine();
            System.out.println("Digite a idade do atleta:");
            int idade = input.nextInt();
            System.out.println("Digite o peso do atleta:");
            double peso = input.nextDouble();
            System.out.println("Digite o esporte do atleta:");
            String esporteAtleta = input.nextLine();
            System.out.println("Digite o país do atleta:");
            String pais = input.nextLine();
            System.out.println("Digite a categoria do atleta:");
            String categoria = input.nextLine();
            System.out.println("Digite se o atleta é destro:[Y/N]");
            char destroChar = input.next().charAt(0);
            
            if (destroChar == 'Y' || destroChar == 'y'){
                destroOuCanhoto = true;
            } else if (destroChar == 'N' || destroChar == 'n'){
                destroOuCanhoto = false;
            } else {
                System.out.println("Digite um valor válido!");
            }
            boolean destro = destroOuCanhoto;

            
            Boxeador atleta = new Boxeador(nomeAtleta, idade, peso, esporteAtleta, pais, categoria, destro);
            System.out.println("Nome: " + atleta.getNome() + "\nIdade: " + atleta.getIdade() + "\nPeso: " + atleta.getPeso() + "\nEsporte: " + atleta.getEsporte() + "\nPais: " + atleta.getPais() + "\nCategoria: " + atleta.getCategoria() + "\nDestro: " + atleta.Destro());

        input.close();
        }
    }
    
