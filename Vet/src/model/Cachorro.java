package model;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String name, int age, String raca) {
        super(name, age);
        this.raca = raca;
    }

    public String getRaca() { 
        return raca;
     }

    public void setRaca(String raca) { 
        this.raca = raca;
     }

     @Override
     public String toString() {
            return "Cachorro [raca=" + raca + ", toString()=" + super.toString() + "]";
     }
    
}
