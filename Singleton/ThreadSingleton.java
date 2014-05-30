package Singleton;

/**
 * Thread safe singleton which uses a synchronised method to get the instances.
 * Still vulnerable to reflection, and is not efficient as the whole instance method
 * is synchronised, so threads may have to wait even if the object is instantiated.
 */
public class ThreadSingleton {
    
    private static ThreadSingleton INSTANCE;
    
    private ThreadSingleton(){}
    
    public static synchronized ThreadSingleton instance(){
        if (INSTANCE == null){
            try {
                INSTANCE = new ThreadSingleton();
            } catch (Exception ex){
                System.out.println("Exception caught.");
            }
        }
        return INSTANCE;
    }
    
}
