package br.edu.ifpr.veterinario;

public class Veterinario {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro(5, 10, "Au au", "Poodle");
        Gato gato = new Gato(3, 5, "Miau", "Persa", "Branco");
   
        System.out.println("Cachorro: " + cachorro.getSom());
        System.out.println("Gato: " + gato.getSom());
    }
}

