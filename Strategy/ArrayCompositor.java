package Strategy;

/**
 * Break into components at regular intervals
 */
public class ArrayCompositor extends Compositor {

    int interval;
    
    public ArrayCompositor(int interval) {
        this.interval = interval;
    }
    
    @Override
    public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink, int componentCount, int lineWidth, int[] breaks) {
        return 0;
    }

}
