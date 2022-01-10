package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    protected Double area;


    public Weed(String name) {
        super(name);
    }

    public Weed(String name, Double height, Double area) {
        super(name, height);
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                '}';
    }
}
