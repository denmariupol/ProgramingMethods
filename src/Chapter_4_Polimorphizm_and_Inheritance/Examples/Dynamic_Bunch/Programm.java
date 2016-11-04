package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        PointReport report = new PointReport();
        Point1D p1 = new Point1D(-7);
        report.printReport(p1);
        Point2D p2 = new Point2D(3,4);
        report.printReport(p2);
        Point3D p3 = new Point3D(3,4,5);
        report.printReport(p3);
    }

}
