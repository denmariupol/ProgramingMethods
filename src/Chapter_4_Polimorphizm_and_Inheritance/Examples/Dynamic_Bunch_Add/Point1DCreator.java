package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch_Add;
import Chapter_3_Class_and_Objects.Variant_A.Task_5.Publisher;
import Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch.Point1D;
/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point1DCreator {
    public Point1D createPoint(){
        System.out.println("point1D");
        return new Point1D(1);
    }

}
