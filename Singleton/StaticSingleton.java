/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton;

/**
 * Allows exceptions to be caught at initialisation, but still initialises if not
 * needed, and also can have multiple instances created by reflection. Not thread safe.
 */
public class StaticSingleton {
    
    private static StaticSingleton INSTANCE;
    
    private StaticSingleton(){}
    
    static {
        try {
            INSTANCE = new StaticSingleton();
        } catch (Exception ex){
            System.out.println("Exception caught.");
        }
    }
    
    public static StaticSingleton instance(){
        return INSTANCE;
    }
    
}
