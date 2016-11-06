package Chapter_6_Interface_and_Annotation.Examples.Interface_Implementation;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class Triangle extends AbstractShape {
    private double b;
    private double angle;

    public Triangle(double a,double b,double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getB() {
        return b;
    }

    public double getAngle() {
        return angle;
    }
}
