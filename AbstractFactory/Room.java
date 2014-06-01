package AbstractFactory;

import java.util.ArrayList;

/**
 *
 */
public class Room {

    ArrayList<Door> doors;

    public Room() {
        doors = new ArrayList<>();
    }
    
    public void addDoor(Door d){ doors.add(d); }
    
}