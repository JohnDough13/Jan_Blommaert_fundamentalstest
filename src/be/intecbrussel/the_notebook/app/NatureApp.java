package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {
    public static void main(String[] args) {
        ForestNotebook edenInTheMaking = new ForestNotebook();
        Plant apple = new Tree("Apple tree");
        Plant maryGold = new Flower("Marygold");
        Plant haze = new Weed("John d.");
        Plant blackberries = new Bush("Blake", "blackberries");

    }
}
