package Chapter_11_Threads.Examples.ResourcePool;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ingener_mobil on 28.11.2016.
 */
public class ChannelPool <T> {
    private final static int POOL_SIZE = 5; // размер пула
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);//объявление семафора
    private final Queue<T> resources = new LinkedList<T>();//объявление очереди каналов
    public ChannelPool(Queue<T> source) {
        resources.addAll(source);
    }
    //запрос к семафору ,в случае успеха извлекается из очереди канал и возвращаем
    public T getResource(long maxWaitMillis) throws ResourсeException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                T res = resources.poll();
                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourсeException(e);
        }
        throw new ResourсeException(":превышено время ожидания");
    }
    public void returnResource(T res) {
        resources.add(res); // возвращение экземпляра в пул
        semaphore.release();//освобождаем семафора
    }
}