package Chapter_5_Inner_Classes.Examples.NestedClass;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Ship {
    private int id;

    public static class LifeBoat{
        private int boatId;
        public static void down(){
            System.out.println("шлюпки на водц");
        }
        public static void swim(){
            System.out.println("отплытие");
        }
    }
}
