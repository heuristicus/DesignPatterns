package Decorator;

/**
 *
 */
public class Decorator extends VisualComponent {
    
    VisualComponent c;
    String name;

    public Decorator(VisualComponent c, String name) {
        this.c = c;
        this.name = name;
    }

    @Override
    public void draw() {
        c.draw();
        System.out.println("Default draw operation called on " + name);
    }

    @Override
    public void resize() {
        c.resize();
    }
    
    
    
    
    
}
