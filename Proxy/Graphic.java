package Proxy;

import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 * Define an interface for graphical objects
 */
public interface Graphic {

    public void Draw(Point p);
    public void HandleMouse(MouseEvent e);
    public Point getExtent();
    public void load();
    public void save();
    
}
