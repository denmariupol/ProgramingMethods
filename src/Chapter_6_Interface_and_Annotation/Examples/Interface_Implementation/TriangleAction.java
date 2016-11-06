package Chapter_6_Interface_and_Annotation.Examples.Interface_Implementation;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class TriangleAction implements IShapeAction<Triangle> {
    @Override
    public double computePerimetr(Triangle shape) {
            return  (shape.getA() + shape.getB());
    }

    @Override
    public double computeSquare(Triangle shape) {
        return 0.5 * (shape.getA() * shape.getB());
    }
}
