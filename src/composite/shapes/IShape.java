package composite.shapes;

import java.awt.*;

public interface IShape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    Boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    Boolean isSelected();
    void paint(Graphics graphics);
}
