package Chapter_11_Threads.Examples.Atomic_Field;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Programm {
    private static final int BROKERS = 30;
    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        market.start();
        for (int i = 0; i < BROKERS; i++) {
            new Broker(market).start();
        }
    }
}
