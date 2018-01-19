package delegate;

import delegate.shapes.Circle;
import delegate.shapes.Square;

public class Demo {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphic(new Square());
        painter.paint();

        painter.setGraphic(new Circle());
        painter.paint();
    }
}
