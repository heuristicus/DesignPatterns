package Decorator;

/**
 *
 */
public class Window {
    
    VisualComponent c;
    
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        
        TextView view = new TextView();
        
        w1.setContents(view);
        w2.setContents(new BorderDecorator(new ScrollDecorator(view, "scroll"), 1, "border"));
        
        w1.show();
        w2.show();
    }
    
    public void setContents(VisualComponent c){
        this.c = c;
    }
    
    public void show(){
        c.draw();
    }

}
