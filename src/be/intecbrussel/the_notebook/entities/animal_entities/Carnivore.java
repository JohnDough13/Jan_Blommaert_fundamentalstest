package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal{

    private double maxFoodSize = 69.69;

    public Carnivore(String name){
        this(name,0.60,1.2,2.01);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name,weight, height, length);

    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore '"+super.toString()+ "'{" +
                "maxFoodSize=" + maxFoodSize +
                '}';
    }
}
