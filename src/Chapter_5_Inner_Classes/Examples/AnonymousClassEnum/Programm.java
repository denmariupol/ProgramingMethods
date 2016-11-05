package Chapter_5_Inner_Classes.Examples.AnonymousClassEnum;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        int i = 4;
        for (Shape s : Shape.values()) {
            s.setShape(3,i--);
            System.out.println(s+" площадь="+s.computeSquare());
        }
    }
}
