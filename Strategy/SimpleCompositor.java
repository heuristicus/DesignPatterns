package Strategy;

/**
 * Look a line at a time to find breaks
 */
public class SimpleCompositor extends Compositor {

    @Override
    public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink, int componentCount, int lineWidth, int[] breaks) {
        return 0;
    }

}
