package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class NatureApp {

    public static void main(String[] args) {
        Set<Plant> plantDiet = new LinkedHashSet<>();
        ForestNotebook edenInTheMaking = new ForestNotebook();
        Tree apple = new Tree("Apple tree");
        Flower maryGold = new Flower("Marygold");
        Weed haze = new Weed("John d.");
        Bush blackberries = new Bush("Blake");

        plantDiet.add(haze);
        plantDiet.add(blackberries);

        Herbivore rabbit = new Herbivore("Bunny", 12, 13, 14);
        Herbivore chicken = new Herbivore("Poulette");
        Herbivore chickOne = new Herbivore("Chickie");
        Herbivore chickTwo = new Herbivore("Chickie Chickie");
        Herbivore chickTree = new Herbivore("Chickie Chickie Chickie");
        Omnivore pig = new Omnivore("King Pig");
        Carnivore hawk = new Carnivore("Black Hawk");

        chickOne.setPlantDiet(plantDiet);
        rabbit.setPlantDiet(plantDiet);
        chickOne.setPlantDiet(plantDiet);
        pig.setPlantDiet(plantDiet);
        chicken.setPlantDiet(plantDiet);
        chickTree.setPlantDiet(plantDiet);
        chickTwo.setPlantDiet(plantDiet);

        edenInTheMaking.addPlant(apple);
        edenInTheMaking.addPlant(maryGold);
        edenInTheMaking.addPlant(haze);
        edenInTheMaking.addPlant(blackberries);
        edenInTheMaking.addAnimal(rabbit);
        edenInTheMaking.addAnimal(chicken);
        edenInTheMaking.addAnimal(chickOne);
        edenInTheMaking.addAnimal(chickTree);
        edenInTheMaking.addAnimal(pig);
        edenInTheMaking.addAnimal(hawk);

        edenInTheMaking.printNotebook();
        System.out.println(edenInTheMaking.getPlantCount());
        System.out.println(edenInTheMaking.getAnimalCount());

    }
}
