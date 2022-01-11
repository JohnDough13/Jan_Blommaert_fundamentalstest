package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ForestNotebook {
    private List<Carnivore> carnivores = new LinkedList<>();
    private List<Omnivore> omnivores = new LinkedList<>();
    private List<Herbivore> herbivores = new LinkedList<>();
    private int plantCount = 0;
    private int animalCount = 0;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();

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

    public void addPlant(Plant plant) {
        plants.add(plant);
        plantCount++;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        if (animal.getClass() == Carnivore.class) {
            carnivores.add((Carnivore) animal);
        } else if (animal.getClass() == Herbivore.class) {
            herbivores.add((Herbivore) animal);
        } else {
            System.out.println("Unregistered specimen");
        }
        animalCount++;
    }

    public void printNotebook() {
        System.out.println("Every animal seen so far:");
        animals.forEach(System.out::println);
        System.out.println("");
        System.out.println("Every plant seen so far:");
        plants.forEach(System.out::println);
    }

    public void sortAnimalsByName() {
        animals = List.of((Animal[]) Stream.of((Animal[]) animals.toArray())
                .sorted(Comparator.comparing(Animal::getName))
                .toArray());
    }

    public void sortPlantsByName() {
        plants = List.of((Plant[]) Stream.of((Plant[]) plants.toArray())
                .sorted(Comparator.comparing(Plant::getName))
                .toArray());
    }

    public void sortAnimalsByHeight() {
        animals = List.of((Animal[]) Stream.of((Animal[]) animals.toArray())
                .sorted(Comparator.comparing(Animal::getHeight))
                .toArray());
    }

    public void sortPlantsByHeight() {
        plants = List.of((Plant[]) Stream.of((Plant[]) plants.toArray())
                .sorted(Comparator.comparing(Plant::getHeight))
                .toArray());
    }
}
