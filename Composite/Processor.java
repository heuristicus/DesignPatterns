package Composite;

/**
 *
 */
public class Processor extends Equipment {

    public Processor(String name, int powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public int powerConsumption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Equipment e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Equipment e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
