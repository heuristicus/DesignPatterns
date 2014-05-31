package Composite;

import java.util.LinkedList;

/**
 *
 */
public class CompositeEquipment extends Equipment {
    
    LinkedList<Equipment> list;

    public CompositeEquipment(String name, int powerConsumption) {
        super(name, powerConsumption);
        this.list = new LinkedList<>();
    }

    @Override
    public int powerConsumption() {
        int totalConsumption = 0;
        
        for (Equipment equipment : list) {
            totalConsumption += equipment.powerConsumption();
        }
        
        return totalConsumption;
    }

    @Override
    public void add(Equipment e) {
        list.add(e);
    }

    @Override
    public void remove(Equipment e) {
        list.remove(e);
    }
}