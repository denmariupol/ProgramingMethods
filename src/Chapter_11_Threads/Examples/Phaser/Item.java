package Chapter_11_Threads.Examples.Phaser;

/**
 * Created by Ingener_mobil on 02.12.2016.
 * перевозимый товар
 */
public class Item {
    private int registrationNumber;
    public Item(int number) {
        this.registrationNumber = number;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
}
