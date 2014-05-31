package Iterator;

import java.util.LinkedList;

/**
 * The list interface that the iterators will be used to look at
 */
public class List<T> {
    
    LinkedList<T> list;
    
    public List(){
        list = new LinkedList<>();
    }
    
    public int count(){
        return list.size();
    }
    
    public T get(int index){
        return list.get(index);
    }
    
    public T first(){
        return list.getFirst();
    }
    
    public T last(){
        return list.getLast();
    }
    
    public boolean contains(T item){
        return list.contains(item);
    }
    
    public void append(T item){
        list.addLast(item);
    }
    
    public void prepend(T item){
        list.addFirst(item);
    }
    
    public void remove(T item){
        list.remove(item);
    }
    
    public void removeLast(){
        list.removeLast();
    }
    
    public void removeFirst(){
        list.removeFirst();
    }
    
    public void removeAll(){
        list.removeAll(list);
    }
    
    public T top(){
        return list.peek();
    }
    
    public T pop(){
        return list.pop();
    }
    
    public void push(T item){
        list.push(item);
    }
    
}
