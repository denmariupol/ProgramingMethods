package Chapter_6_Interface_and_Annotation.Examples.Interface_Implementation;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class Rectangle extends AbstractShape{
    private double b;

    public Rectangle(double a,double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }
}
