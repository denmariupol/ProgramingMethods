package Chapter_11_Threads.Examples.Q_Exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Ingener_mobil on 29.11.2016.
 */
public class Subject {
    protected static Exchanger<Item> exchanger = new Exchanger<>();
    private String name;
    protected Item item;

    public Subject(String name, Item item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
