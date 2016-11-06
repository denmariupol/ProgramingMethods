package Chapter_6_Interface_and_Annotation.Examples.Interface_Implementation;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public abstract class AbstractShape {
    private double a;

    public AbstractShape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
}
