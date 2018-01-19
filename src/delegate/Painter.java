package delegate;

import delegate.shapes.IGraphic;

public class Painter {
    private IGraphic graphic;

    void setGraphic(IGraphic g){
        this.graphic = g;
    }

    void paint(){
        graphic.draw();
    }
}
