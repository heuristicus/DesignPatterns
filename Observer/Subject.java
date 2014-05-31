package Observer;

import java.util.LinkedList;

/**
 * 
 */
public abstract class Subject {
    
    private LinkedList<Observer> list;
    
    protected Subject(){
        list = new LinkedList<>();
    }
    
    public void attach(Observer o){
        list.add(o);
    };
    
    public void detach(Observer o){
        list.remove(o);
    };
    
    public void doNotify(){
        for (Observer observer : list) {
            observer.update(this);
        }
    };
    
}
