package classModels;

public class Jogador {
    protected String nome;
    protected int idade;
    protected boolean capitao;

    public Jogador(String nome, int idade, boolean capitao) {
        this.nome = nome;
        this.idade = idade;
        this.capitao = capitao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isCapitao() {
        return capitao;
    }
}
