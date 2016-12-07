package Chapter_11_Threads.Examples.Q_Exchanger;

/**
 * Created by Ingener_mobil on 29.11.2016.
 */
public class Item {
    private Integer id;
    private Integer number;

    public Item(Integer id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }
}
