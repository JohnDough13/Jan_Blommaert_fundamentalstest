package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Set;

public class Herbivore extends Animal{
    Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(double weight, double height, double length) {
        super(weight, height, length);
    }

    public ArrayList<Plant> getPlantDiet() {
        return (ArrayList<Plant>) plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }


}
