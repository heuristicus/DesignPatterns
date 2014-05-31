package Iterator;

/**
 *
 * @author michal
 */
public class Employee {
    
    String name;
    int ID;

    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return ID + ": " + name + "\n";
    }
        
}