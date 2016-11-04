package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch_Add;

import Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch.Point2D;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point2DCreator extends Point1DCreator{
    @Override
    public Point2D createPoint(){
        System.out.println("Point2D");
        return new Point2D(2,5);
    }
}
