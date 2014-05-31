package Iterator;

/**
 * The abstract iterator class that defines operations that all iterators must
 * implement.
 */
public abstract class Iterator<T> {
    
    protected Iterator(){}
    
    public abstract void first();
    public abstract void next();
    public abstract T currentItem();
    public abstract boolean isDone();
    
}
