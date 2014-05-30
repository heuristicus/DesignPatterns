package Singleton;

/**
 * Gets around the problem of reflection allowing multiple instances of the singleton.
 * Problem is that it does not allow lazy initialisation.
 */
public enum EnumSingleton {
    INSTANCE;
    
    public static void singletonMethod(){
        // does something.
    }
    
}
