package Chapter_5_Inner_Classes.Examples.InnerClass;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Ship {
    private Engine engine;
    public class Engine{
        public void launch(){
            System.out.println("Enigine started");
        }
    }
    public void init(){
        engine = new Engine();
        engine.launch();
    }
}
