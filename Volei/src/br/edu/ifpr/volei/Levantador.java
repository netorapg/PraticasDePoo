package br.edu.ifpr.volei;
final class Levantador extends Jogador {
    
    private boolean bomDeBloqueio;
    private boolean capitao;

    public Levantador(String nome, int idade, double altura, boolean bomDeBloqueio, boolean capitao){
        super(nome, idade, altura);
        this.bomDeBloqueio = bomDeBloqueio;
        this.capitao = capitao;

    }

    

    public boolean getbomDeBloqueio(){
        return bomDeBloqueio;
    
    }
    public boolean getCaptao(){
        return capitao;
    }

    @Override
    public String getCategoria() {
        return "Levantador";
    }

    @Override
    public String toString() {
        return "NOME: " + nome + " IDADE: " + idade + " ALTURA: " + altura + " CATEGORIA: " + getCategoria() + " BOM DE BLOQUEIO: " + bomDeBloqueio + " CAPITAO: " + capitao;
    }

}