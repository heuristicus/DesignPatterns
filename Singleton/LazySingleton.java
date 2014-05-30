package Singleton;

/**
 * Initialises only when the instance method is called. Still vulnerable to reflection
 * and not thread safe, but also allows catching of exceptions and saves on memory.
 */
public class LazySingleton {
    
    private static LazySingleton INSTANCE;
    
    private LazySingleton(){}
    
    public static LazySingleton instance(){
        if (INSTANCE == null){
            try {
                INSTANCE = new LazySingleton();
            } catch (Exception ex){
                System.out.println("Exception caught.");
            }
        }
        return INSTANCE;
    }
    
}
