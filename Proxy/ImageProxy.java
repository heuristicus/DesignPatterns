package Proxy;

import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 *
 */
public class ImageProxy implements Graphic {

    Image im;
    Point extent;
    String fname;

    public ImageProxy(String fname) {
        this.fname = fname;
        this.extent = new Point(0,0);
        this.im = null;
    }

    // The image is only actually loaded if this method is called - upon creation
    // of the proxy nothing happens.
    public Image getIm() {
        if (im == null){
            im = new Image(fname);
        }
        return im;
    }
    
    @Override
    public void Draw(Point p) {
        getIm().Draw(p);
    }

    @Override
    public void HandleMouse(MouseEvent e) {
        getIm().HandleMouse(e);
    }

    // This method can also force creation of the image
    @Override
    public Point getExtent() {
        if (extent.equals(new Point(0,0))){
            extent = getIm().getExtent();
        }
        return extent;
    }

    @Override
    public void load() {
        // load stuff
    }
    
    @Override
    public void save() {
        // save stuff
    }

}
