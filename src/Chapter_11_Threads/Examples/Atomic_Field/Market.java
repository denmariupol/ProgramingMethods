package Chapter_11_Threads.Examples.Atomic_Field;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Market extends Thread {
    private AtomicLong index;
    public Market(AtomicLong index){
        this.index = index;
    }

    public AtomicLong getIndex() {
        return index;
    }
    @Override
    public void run(){
        Random random = new Random();
        try {
            // Изменения поля index aиксируются методом
            // addAndGet(long delta) атомарного добавления
            // переданного значения к текущему.
            index.addAndGet(random.nextInt(500));
            Thread.sleep(random.nextInt(500));
//            index.addAndGet(-1 * random.nextInt(10));
//            Thread.sleep(random.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
