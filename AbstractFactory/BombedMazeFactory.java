package AbstractFactory;

/**
 *
 */
public class BombedMazeFactory extends MazeFactory {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom() {
        return new RoomWithBomb();
    }
    
}