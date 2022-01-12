package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    private double area = 9;


    public Weed(String name) {
        super(name,10.5);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed '" + super.toString() + "'{" +
                "area=" + area +
                '}';
    }
}
