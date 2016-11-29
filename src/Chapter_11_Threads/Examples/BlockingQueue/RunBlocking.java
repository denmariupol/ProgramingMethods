package Chapter_11_Threads.Examples.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Ingener_mobil on 28.11.2016.
 * объявлена очередь из пяти элементов.
 Изначально в ней размещены три элемента.
 В первом потоке производится попытка добавления трех элементов.
 Два добавятся успешно, а при попытке добавления третьего поток будет
 остановлен до появления свободного места  в очереди.
 Только когда второй поток извлечет один элемент и освободит
 место, первый поток получит возможность добавить свой элемент
 */
public class RunBlocking {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(2);
        new Thread(){
            public void run(){
                for (int i = 0; i < 4; i++) {
                    try {
                        queue.put("Java"+i);//добавление 3-х
                        System.out.println("Element "+i+" added");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                try {
                    Thread.sleep(1000);
                    //извлечение одного
                    System.out.println("Element "+queue.take()+" took");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
