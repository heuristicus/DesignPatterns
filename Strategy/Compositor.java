package Strategy;

/**
 * Concrete subclasses of this define specific line breaking strategies
 */
public abstract class Compositor {

    public abstract int compose(Coord[] natural, Coord[] stretch, Coord[] shrink,
                                 int componentCount, int lineWidth, int[] breaks);
    
}
