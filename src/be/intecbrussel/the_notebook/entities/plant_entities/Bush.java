package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {

    protected String fruit;
    protected LeafType leafType;

    public Bush(String name, String fruit) {
        super(name);
        this.fruit = fruit;
    }

    public Bush(String name, Double height, String fruit) {
        super(name, height);
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                '}';
    }
}

