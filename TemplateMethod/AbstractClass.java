package TemplateMethod;

/**
 *
 */
public abstract class AbstractClass {
    
    public void templateMethod(){
        System.out.println("doing 1");
        method1();
        System.out.println("doing 2");
        method2();
    }
    
    public abstract void method1();
    public abstract void method2();
    
}
