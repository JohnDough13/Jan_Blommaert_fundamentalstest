package be.intecbrussel.the_notebook.entities.plant_entities;

public class Plant {

    private String name;
    private Double height;

    public Plant(String name){
        this.name=name;
    }

    public Plant(String name,Double height){
        this.name=name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

}
