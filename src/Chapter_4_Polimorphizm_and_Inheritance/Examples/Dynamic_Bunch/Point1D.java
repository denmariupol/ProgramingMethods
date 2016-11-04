package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point1D {
    private int x;

    public Point1D(int x) {
        this.x = x;
    }

    public double length() {
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return " x=" + x;
    }
}
