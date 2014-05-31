/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator;

/**
 *
 * @author michal
 */
public class ListIterator<T> extends Iterator<T> {

    List<T> list;
    int current;
    
    public ListIterator(List<T> list) {
        this.list = list;
        this.current = 0;
    }

    @Override
    public void first() {
        this.current = 0;
    }

    @Override
    public void next() {
        this.current++;
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
        return current == list.count();
    }
    
}
