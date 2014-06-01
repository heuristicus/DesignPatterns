package Proxy;

import java.util.ArrayList;

/**
 *
 */
public class TextDocument {

    ArrayList<Graphic> graphics = new ArrayList<>();
    
    public void insert(Graphic g){
        graphics.add(g);
    }
    
    public static void main(String[] args) {
        TextDocument d = new TextDocument();
        
        // use the image proxy instead of using the actual object.
        d.insert(new ImageProxy("filename"));
    }
    
}
