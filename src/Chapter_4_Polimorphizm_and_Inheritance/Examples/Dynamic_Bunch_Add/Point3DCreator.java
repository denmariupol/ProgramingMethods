package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch_Add;

import Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch.Point3D;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point3DCreator extends Point2DCreator{
    @Override
    public Point3D createPoint(){
        System.out.println("Point3D");
        return new Point3D(3,7,8);
    }
}
