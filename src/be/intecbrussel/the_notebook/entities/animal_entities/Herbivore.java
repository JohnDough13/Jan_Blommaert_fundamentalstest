package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal{
    Set<Plant> plantDiet = new LinkedHashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(double weight, double height, double length) {
        super(weight, height, length);
    }

    public Set <Plant> getPlantDiet() {
        return (Set <Plant>) plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){
        this.plantDiet = (Set<Plant>) plant;
    }

    public void printDiet (){
        System.out.println(plantDiet);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                '}';
    }
}
