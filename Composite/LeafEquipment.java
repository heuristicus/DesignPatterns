package Composite;

/**
 *
 */
public class LeafEquipment extends Equipment {

    public LeafEquipment(String name, int powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public int powerConsumption() {
        return powerConsumption;
    }

    @Override
    public void add(Equipment e) {}

    @Override
    public void remove(Equipment e) {}
    
}
