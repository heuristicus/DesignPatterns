package Mediator;

/**
 *
 */
public class Button extends Widget {

    public Button(DialogDirector director) {
        super(director);
    }

    @Override
    public void handleMouse() {
        changed();
    }
    
    

}
