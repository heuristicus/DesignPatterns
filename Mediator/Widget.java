package Mediator;

/**
 *
 */
public abstract class Widget {

    private DialogDirector director;

    public Widget(DialogDirector director) {
        this.director = director;
    }
    
    public void changed(){
        director.widgetChanged(this);
    }
    
    public void handleMouse(){}
}
