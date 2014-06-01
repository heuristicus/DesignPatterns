package AbstractFactory;

/**
 *
 */
public class MazeGame {
    
    public static void main(String[] args) {
        MazeGame m = new MazeGame();
        // changing the factory used changes the maze we end up with
        MazeFactory f = new MazeFactory();
        
        Maze g = m.createMaze(f);
    }

    public Maze createMaze(MazeFactory factory){
        Maze m = factory.makeMaze();
        
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        
        m.addRoom(r1);
        m.addRoom(r2);
        
        r1.addDoor(factory.makeDoor());
        r2.addDoor(factory.makeDoor());
        
        return m;
    }
    
}
