package classModels;

public final class Ponteiro extends Jogador {
    
    private int numArremessos;

    public Ponteiro(String nome, int idade, boolean capitao, int numArremessos) {
        super(nome, idade, capitao);
        this.numArremessos = numArremessos;
    }

    public void setNumArremessos(int numArremessos) {
        this.numArremessos = numArremessos;
    }

    public int getNumArremessos() {
        return numArremessos;
    }

    public void imprimirPonteiro(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Capitão: " + this.capitao);
        System.out.println("Número de arremessos: " + this.numArremessos);
    }
}
