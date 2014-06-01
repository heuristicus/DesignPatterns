package AbstractFactory;

/**
 *
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom() {
        return new EnchantedRoom();
    }

    @Override
    public Door makeDoor() {
        return new DoorNeedingSpell();
    }
}