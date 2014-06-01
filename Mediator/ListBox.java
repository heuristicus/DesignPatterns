package Mediator;

import java.util.LinkedList;

/**
 *
 */
public class ListBox extends Widget {

    public ListBox(DialogDirector d) {
        super(d);
    }
    
    public void setList(LinkedList<String> items){};
    public String getSelection(){ return null; }
    
}