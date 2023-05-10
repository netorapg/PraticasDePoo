package classModels;

public final class Levantador extends Jogador {
    private double altura;

    public Levantador(String nome, int idade, boolean capitao, double altura) {
        super(nome, idade, capitao);
        this.altura = altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void imprimirLevantador(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Capitão: " + this.capitao);
        System.out.println("Altura: " + this.altura);
    }

    

}
