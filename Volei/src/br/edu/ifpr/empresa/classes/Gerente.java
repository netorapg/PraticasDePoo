package br.edu.ifpr.empresa.classes;

public final class Gerente extends Funcionario{

    private String departamento;
    private String turno;

    public Gerente(String nome, int idade, double salario, String departamento, String turno) {
        super(nome, idade, salario);
        this.departamento = departamento;
        this.turno = turno;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String getFuncao() {
        return "Gerente";
    }

    @Override
    public String toString() {
        return "Gerente [departamento=" + departamento + ", turno=" + turno + ", nome=" + nome + ", idade=" + idade
                + ", salario=" + salario + "]";
    }
    
}
