package AbstractFactory;

/**
 * Acts as both the abstract and concrete factory.
 */
public class MazeFactory {

    public MazeFactory() {}
    
    public Maze makeMaze(){ return new Maze();}
    public Room makeRoom(){ return new Room();}
    public Wall makeWall(){ return new Wall();}
    public Door makeDoor(){ return new Door();}
}
