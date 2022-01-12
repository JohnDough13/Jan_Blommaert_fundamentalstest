package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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

        if (plants.contains(plant)) {
            plants.add(plant);
            plantCount++;

        } else {
            System.out.println("This plant's name is:" + plant.getName());
            plants.add(plant);
            plantCount++;
        }

    }

    public void addAnimal(Animal animal) {

        if (animal.getClass() == Carnivore.class) {
            if (!carnivores.contains(animal)) {
                carnivores.add((Carnivore) animal);
                animals.add(animal);
            } else {
                System.out.println("This carnivore is called a: " + animal.getName());
            }
        } else if (animal.getClass() == Herbivore.class) {
            if (!herbivores.contains(animal)) {
                herbivores.add((Herbivore) animal);
                animals.add(animal);

            } else {
                System.out.println("This herbivore is called a: " + animal.getName());
            }
        } else if (animal.getClass() == Omnivore.class) {
            if (!omnivores.contains(animal)) {
                omnivores.add((Omnivore) animal);
                animals.add(animal);
            } else {
                System.out.println("This omnivore is called a: " + animal.getName());
            }

        } else {
            System.out.println("Alien specimen.");
        }
        animalCount++;
    }

        public void printNotebook () {
            System.out.println("Every animal seen so far:");
            animals.forEach(System.out::println);
            System.out.println("");
            System.out.println("Every plant seen so far:");
            plants.forEach(System.out::println);
        }

        public void sortAnimalsByName () {
            animals = animals.stream().distinct().sorted((Comparator.comparing(Animal::getName))).collect(Collectors.toList());
        }

        public void sortPlantsByName () {
            plants = plants.stream().distinct().sorted((Comparator.comparing(Plant::getName))).collect(Collectors.toList());
        }

        public void sortAnimalsByHeight () {
            animals = animals.stream().distinct().sorted((Comparator.comparing(Animal::getHeight))).collect(Collectors.toList());
        }


    public void sortPlantsByHeight () {
      plants = plants.stream().distinct().sorted((Comparator.comparing(Plant::getHeight))).collect(Collectors.toList());
    }
    }
