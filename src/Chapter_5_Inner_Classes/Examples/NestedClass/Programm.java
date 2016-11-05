package Chapter_5_Inner_Classes.Examples.NestedClass;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Ship.LifeBoat.down();
        Ship.LifeBoat s = new Ship.LifeBoat();
        s.swim();
    }
}
