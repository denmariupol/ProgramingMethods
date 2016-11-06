package Chapter_6_Interface_and_Annotation.Examples.Interface_Implementation;

import java.util.IllegalFormatException;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        try{
            Rectangle rectangle = new Rectangle(2,3);
            IShapeAction<Rectangle> rectangleAction = new RectangleAction();
            System.out.println("Rectangle square:"+rectangleAction.computeSquare(rectangle));
            System.out.println("Rectangle perimetr:"+rectangleAction.computePerimetr(rectangle));

            Triangle triangle = new Triangle(2,3,3/6);
            IShapeAction<Triangle>triangleAction = new TriangleAction();
            System.out.println("Triangle square:"+triangleAction.computeSquare(triangle));
            System.out.println("Triangle perimetr:"+triangleAction.computePerimetr(triangle));
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
