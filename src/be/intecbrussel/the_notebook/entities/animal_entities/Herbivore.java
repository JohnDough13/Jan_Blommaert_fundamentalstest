package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal {
    Set<Plant> plantDiet = new LinkedHashSet<>();

    public Herbivore(String name) {
        this(name,0.8,0.2,1.1);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet() {
        plantDiet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Herbivore'"+super.toString()+"'{" +
                "plantDiet=" + plantDiet +
                '}';
    }
}
