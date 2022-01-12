package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant {

    private Scent smell=Scent.EARTHY;


    public Flower(String name) {
        this(name,0.50);
    }

    public Flower(String name, Double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower '" + super.getName() + "'{" +
                "smell=" + smell +
                '}';
    }
}
