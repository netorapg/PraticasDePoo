package model;

public class Gato extends Animal {
    private String cor;

    public Gato(String name, int age, String cor) {
        super(name, age);
        this.cor = cor;
    }

    public String getCor() { 
        return cor;
    }

    public void setCor(String cor) { 
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato [cor=" + cor + ", toString()=" + super.toString() + "]";
    }
    
}
