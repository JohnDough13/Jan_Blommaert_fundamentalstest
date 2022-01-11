package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {

    public static void main(String[] args) {
        ForestNotebook edenInTheMaking = new ForestNotebook();
        Plant apple = new Tree("Apple tree");
        Plant maryGold = new Flower("Marygold");
        Plant haze = new Weed("John d.");
        Plant blackberries = new Bush("Blake", "blackberries");

        Animal rabbit = new Herbivore(12,13,14);
        Animal chicken = new Herbivore("Poulette");
        Animal chickOne = new Herbivore("Chickie");
        Animal chickTwo = new Herbivore("Chickie Chickie");
        Animal chickTree = new Herbivore("Chickie Chickie Chickie");
        Animal pig = new Omnivore("King Pig");
        Animal hawk = new Carnivore("Black Hawk");

        System.out.println(rabbit.getHeight());
        System.out.println(chicken.getName());
        System.out.println(chickOne.getName());
        System.out.println(chickTwo.getName());
        System.out.println(chickTree.getName());
        System.out.println(pig.getName());
        System.out.println(hawk.getName());
    }
}
