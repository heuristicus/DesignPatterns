package Composite;

/**
 *
 */
public abstract class Equipment {

    String name;
    int powerConsumption;

    public Equipment(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }
    
    public abstract int powerConsumption();
    public abstract void add(Equipment e);
    public abstract void remove(Equipment e);
    
}
