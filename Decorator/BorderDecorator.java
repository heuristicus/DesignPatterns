package Decorator;

/**
 *
 */
public class BorderDecorator extends Decorator {

    private int width;
    
    public BorderDecorator(VisualComponent c, int width, String name) {
        super(c, name);
        this.width = width;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }
        
    private void drawBorder(){
        System.out.println("Drawing border");
    }

}
