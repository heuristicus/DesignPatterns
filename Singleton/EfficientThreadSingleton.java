package Singleton;

/**
 * Thread safe singleton which does not force threads to wait once initialised.
 * Still has problems with reflection.
 */
public class EfficientThreadSingleton {
    
    private static EfficientThreadSingleton INSTANCE;
    
    private EfficientThreadSingleton(){}
    
    public static EfficientThreadSingleton instance(){
        synchronized (EfficientThreadSingleton.class){
            if (INSTANCE == null){
                INSTANCE = new EfficientThreadSingleton();
            }
        }
        return INSTANCE;
    }
    
}