package br.edu.ifpr.volei;


abstract class Jogador {
    protected String nome;
    protected int idade;
    protected double altura;

    public Jogador( String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }
    public abstract String getCategoria();

   

}