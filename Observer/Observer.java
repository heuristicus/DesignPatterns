package Observer;

/**
 *
 */
public abstract class Observer {
 
    protected Observer(){}
    
    public abstract void update(Subject changed);
    
}