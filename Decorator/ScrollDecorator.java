package Decorator;

/**
 *
 */
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent c, String name) {
        super(c, name);
    }

    @Override
    public void draw() {
        super.draw();
        drawScrollBar();
    }
    
    private void drawScrollBar(){
        System.out.println("Drawing scrollbar");
    }

}
