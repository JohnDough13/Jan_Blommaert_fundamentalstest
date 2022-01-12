package be.intecbrussel.the_notebook.entities.animal_entities;

public class Animal {
    private String name;
    private double weight;
    private double height;
    private double length;

    public Animal(String name) {
        this(name, 4.7, 9.8, 6.8);
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        setWeight(weight);
        setWeight(height);
        setLength(length);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = (weight > 0) ? weight : -weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : -height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (length > 0) ? length : -length;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
