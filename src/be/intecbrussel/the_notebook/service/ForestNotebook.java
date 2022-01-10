package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.List;

public class ForestNotebook {
    protected List<Carnivore> carnivores;
    protected List<Omnivore> omnivores;
    protected List<Herbivore> herbivores;
    protected int plantCount;
    protected int animalCount;
    protected List<Animal> animals;
    protected List<Plant> plants;

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(List<Animal> animal) {
        this.animals = (List<Animal>) animal;
    }

    public void printNotebook() {

    }

    public void sortAnimalsByName() {

    }

    public void sortPlantsByName() {

    }

    public void sortAnimalsByHeight(){

    }

    public void sortPlantsByHeight(){

    }
}
