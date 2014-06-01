package AbstractFactory;

import java.util.ArrayList;

/**
 *
 */
public class Maze {
    
    ArrayList<Room> rooms;

    public Maze() {
        rooms = new ArrayList<>();
    }
    
    public void addRoom(Room r){ rooms.add(r); }

}
