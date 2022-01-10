package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal{

    protected double maxFoodSize;

    public Carnivore(String name){
        super(name);
    }

    public Carnivore(double weight, double height, double length, double maxFoodSize) {
        super(weight, height, length);
        this.maxFoodSize = maxFoodSize;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                '}';
    }
}
