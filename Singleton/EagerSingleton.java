package Singleton;

/**
 * Still has vulnerabilities to multiple instance creation via reflection, and
 * also creates the object even when not required. Cannot catch exceptions when
 * creating the object either. Not thread safe.
 */
public class EagerSingleton {
        
    private static EagerSingleton INSTANCE = new EagerSingleton();
    
    private EagerSingleton(){}
    
    public static EagerSingleton instance(){
        return INSTANCE;
    }
    
    
}
