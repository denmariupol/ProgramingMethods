package Chapter_6_Interface_and_Annotation.Examples.Interface_Implementation;

import java.awt.*;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class RectangleAction implements IShapeAction<Rectangle> {
    @Override
    public double computePerimetr(Rectangle shape) {
        return  2 * (shape.getA() + shape.getB());
    }

    @Override
    public double computeSquare(Rectangle shape) {
        return shape.getA() * shape.getB();
    }
}
