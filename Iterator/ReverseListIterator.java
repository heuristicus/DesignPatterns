package Iterator;

/**
 *
 * @author michal
 */
public class ReverseListIterator<T> extends Iterator<T> {

    List<T> list;
    int current;
    
    public ReverseListIterator(List<T> list) {
        this.list = list;
        this.current = list.count() - 1;
    }
    
    @Override
    public void first() {
        this.current = list.count() - 1;
    }

    @Override
    public void next() {
        this.current--;
    }

    @Override
    public T currentItem() {
        if (this.isDone()){
            throw new IndexOutOfBoundsException();
        }
        
        return list.get(current);
    }

    @Override
    public boolean isDone() {
        return current == -1;
    }
    
}
