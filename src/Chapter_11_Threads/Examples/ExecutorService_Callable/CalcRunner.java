package Chapter_11_Threads.Examples.ExecutorService_Callable;

import java.util.concurrent.*;

/**
 * Created by Ingener_mobil on 01.12.2016.
 * запуск потока и извлечение результата его выполнения
 */
public class CalcRunner {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Number> future = es.submit(new CalcCallable());
        es.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
