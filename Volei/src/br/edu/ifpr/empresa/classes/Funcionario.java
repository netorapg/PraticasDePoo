package br.edu.ifpr.empresa.classes;

public abstract class Funcionario {
    protected String nome;
    protected int idade;
    protected double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getSalario(){
        return salario;
    }

    public abstract String getFuncao();
}
