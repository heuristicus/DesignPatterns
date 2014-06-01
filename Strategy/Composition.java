package Strategy;

import java.util.ArrayList;

/**
 * Represent text and graphical parts of a document. Arranges the bits using the
 * compositor class which encapsulates a line breaking strategy
 */
public class Composition {
    
    Compositor compositor;
    ArrayList<Component> components;
    int[] lineBreaks;
    int lineWidth;
    int lineCount;    

    public Composition(Compositor compositor) {
        this.compositor = compositor;
        this.components = new ArrayList<>();
        lineBreaks = new int[10]; // arbitrary
    }
    
    public void repair(){
        // arbitrary
        Coord[] natural = new Coord[10];
        Coord[] stretch = new Coord[10];
        Coord[] shrink = new Coord[10];
        
        // find where breaks are 
        int breakCount = compositor.compose(natural, stretch, shrink, lineCount, lineWidth, lineBreaks);
        
        // lay out components according to breaks
        //....
    }
    
    public static void main(String[] args) {
        // Different layouts all defined by using a different internal strategy
        Composition tex = new Composition(new TeXCompositor());
        Composition simple = new Composition(new SimpleCompositor());
        Composition array = new Composition(new ArrayCompositor(100));
    }

}
