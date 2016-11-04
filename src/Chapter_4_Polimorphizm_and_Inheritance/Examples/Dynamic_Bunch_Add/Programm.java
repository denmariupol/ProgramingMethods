package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch_Add;

import Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch.Point2D;
import Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch.Point3D;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Point2DCreator p2cr = new Point3DCreator();
//        Point3D p3 = p2cr.createPoint();
        Point2D p2 = p2cr.createPoint();
        System.out.println(p2cr.createPoint());
    }
}
