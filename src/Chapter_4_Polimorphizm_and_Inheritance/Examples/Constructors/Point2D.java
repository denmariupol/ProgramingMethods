package Chapter_4_Polimorphizm_and_Inheritance.Examples.Constructors;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point2D extends Point1D{
    private int y;
    Point2D(int x,int y){
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
