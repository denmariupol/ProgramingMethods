package Chapter_5_Inner_Classes.Examples.InnerClass;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.init();
        Ship.Engine engine = new Ship().new Engine();//Engine must be public
        engine.launch();//launch must be public
    }
}
