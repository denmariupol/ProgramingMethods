package Chapter_11_Threads.Examples.S_ExecutorService_Callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Ingener_mobil on 02.12.2016.
 */
public class RunExecutor {
    public static void main(String[] args) throws Exception{
        ArrayList<Future<String>> list = new ArrayList<Future<String>>();
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 7; i++) {
            list.add(es.submit(new BaseCallable()));
        }
        es.shutdown();
        for (Future<String> future : list) {
            System.out.println(future.get()+" result fixed");
        }
    }
}
