package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant {
    private LeafType leafType = LeafType.HEART;


    public Tree(String name) {
        this(name,16);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree '" + super.getName() + "'{" +
                "leafType=" + leafType +
                '}';
    }
}
