package Iterator;

/**
 *
 */
public class IteratorTest {

    public static void main(String[] args) {
        Employee a = new Employee("Jose", 1);
        Employee b = new Employee("Amaranta", 2);
        Employee c = new Employee("Arcadio", 3);
        Employee d = new Employee("Aureliano", 4);
        
        List<Employee> l = new List<>();
        l.append(a);
        l.append(b);
        l.append(c);
        l.append(d);
        
        ReverseListIterator<Employee> rli = new ReverseListIterator<>(l);
        ListIterator<Employee> li = new ListIterator<>(l);
        
        printEmployees(rli);
        printEmployees(li);
    }
 
    public static void printEmployees(Iterator<Employee> i){
        for (i.first(); !i.isDone(); i.next()) {
            System.out.println(i.currentItem());
        }
    }
    
}