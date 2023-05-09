package br.edu.ifpr.volei;

final class Ponteiro extends Jogador {
    private boolean bomDeBloqueio;
    private boolean capitao;


    public Ponteiro (String nome, int idade, double altura, boolean bomDeBloqueio, boolean capitao) {
        super(nome, idade, altura);
        this.bomDeBloqueio = bomDeBloqueio;
        this.capitao = capitao;
    }

    public boolean bomDeBloqueio(){
        return bomDeBloqueio;
    }

    public boolean capitao(){
        return capitao;
    }

    @Override
    public String getCategoria() {
        return "Ponteiro";
    }

    @Override
    public String toString() {
        return "NOME: " + nome + " IDADE: " + idade + " ALTURA: " + altura + " CATEGORIA: " + getCategoria() + " BOM DE BLOQUEIO: " + bomDeBloqueio + " CAPITAO: " + capitao;
    }
    
}
