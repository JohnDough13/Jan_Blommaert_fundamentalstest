package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant {

    protected Scent smell;


    public Flower(String name) {
        super(name);
    }

    public Flower(String name, Double height, Scent smell) {
        super(name, height);
        this.smell = smell;
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "smell=" + smell +
                '}';
    }
}
